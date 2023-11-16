package com.tci.assignment.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String empName;

    @ManyToOne
    @JoinColumn(name="dpt_id")
    private Department department;

    private Double amount;

    private String currency;

    private Date joiningDate;

    private Date exitDate;
}
