package com.tci.assignment.service;

import com.tci.assignment.dto.EmployeeBonusResponseDto;
import com.tci.assignment.dto.EmployeeRequestDto;
import com.tci.assignment.entity.Employee;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EmployeeService {
    void saveEmployeeBonus(List<EmployeeRequestDto> dtos);

    Map<String, List<EmployeeBonusResponseDto>> getEmployeeBonus(Date date);
}
