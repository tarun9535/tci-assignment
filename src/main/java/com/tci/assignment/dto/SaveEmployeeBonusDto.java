package com.tci.assignment.dto;

import lombok.Data;

import java.util.List;

@Data
public class SaveEmployeeBonusDto {
    private List<EmployeeRequestDto> employees;
}
