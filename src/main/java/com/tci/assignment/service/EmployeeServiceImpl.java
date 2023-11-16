package com.tci.assignment.service;

import com.tci.assignment.dto.EmployeeBonusResponseDto;
import com.tci.assignment.dto.EmployeeRequestDto;
import com.tci.assignment.entity.Department;
import com.tci.assignment.entity.Employee;
import com.tci.assignment.exception.CustomException;
import com.tci.assignment.repository.DepartmentRepository;
import com.tci.assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void saveEmployeeBonus(List<EmployeeRequestDto> dtos) {
        List<Employee> employees = new ArrayList<>();
        if (!dtos.isEmpty()) {
            for (EmployeeRequestDto dto : dtos) {
                Employee employee = new Employee();
                employee.setEmpName(dto.getEmpName());
                employee.setCurrency(dto.getCurrency());
                employee.setAmount(dto.getAmount());
                employee.setJoiningDate(dto.getJoiningDate());
                employee.setExitDate(dto.getExitDate());
                Department department = departmentRepository.findByDepartmentName(dto.getDepartment());
                if (Objects.isNull(department)) {
                    department = departmentRepository.save(new Department(dto.getDepartment()));
                }
                employee.setDepartment(department);
                employees.add(employee);
            }
            employeeRepository.saveAll(employees);
        }
    }

    @Override
    public Map<String, List<EmployeeBonusResponseDto>> getEmployeeBonus(Date date) {
        List<Employee> employees = employeeRepository.findEligibleEmployeeForBonus(date);
        if (employees.isEmpty()) {
            throw new CustomException("Employees not found");
        }
        return employees.stream()
                .collect(groupingBy(Employee::getCurrency,
                        mapping(Function.identity(),
                                collectingAndThen(toList(),
                                        e -> e.stream().sorted(Comparator.comparing(Employee::getEmpName)).map(EmployeeBonusResponseDto::new)
                                                .collect(toList())))));
    }
}
