package com.tci.assignment.controller;

import com.tci.assignment.dto.EmployeeBonusResponseDto;
import com.tci.assignment.dto.EmployeeRequestDto;
import com.tci.assignment.dto.SaveEmployeeBonusDto;
import com.tci.assignment.entity.Employee;
import com.tci.assignment.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/tci/")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "employee-bonus")
    public void saveEmployeeBonus(@Valid @RequestBody SaveEmployeeBonusDto employees) {
        employeeService.saveEmployeeBonus(employees.getEmployees());
    }

    @GetMapping(value = "employee-bonus")
    public Map<String, List<EmployeeBonusResponseDto>> getEmployeeBonus(@RequestParam @DateTimeFormat(pattern = "MMM-dd-yyyy") Date date) {
        return employeeService.getEmployeeBonus(date);
    }

}
