package com.tci.assignment.dto;

import com.tci.assignment.entity.Employee;
import lombok.Data;


@Data
public class EmployeeBonusResponseDto {
    private String empName;
    private Double amount;

    public EmployeeBonusResponseDto() {
    }

    public EmployeeBonusResponseDto(Employee e) {
        this.empName = e.getEmpName();
        this.amount = e.getAmount();
    }
}
