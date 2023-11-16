package com.tci.assignment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tci.assignment.enums.Currency;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class EmployeeRequestDto {
    @NotNull(message = "firstName may not be blank")
    private String empName;

    @NotNull(message = "department may not be blank")
    private String department;

    @NotNull(message = "firstName may not be blank")
    @Min(message = "amount should be grater than 0", value = 0)
    private Double amount;

    @NotNull(message = "currency may not be blank")
    private String currency;

    @NotNull(message = "joiningDate may not be blank")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM-dd-yyyy")
    private Date joiningDate;

    @NotNull(message = "exitDate may not be blank")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM-dd-yyyy")
    private Date exitDate;
}
