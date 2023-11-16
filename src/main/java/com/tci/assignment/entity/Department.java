package com.tci.assignment.entity;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String departmentName;

    public Department() {
    }

    public Department(String department) {
        this.departmentName =department;
    }
}
