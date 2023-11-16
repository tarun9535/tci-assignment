package com.tci.assignment.controller;

import com.tci.assignment.entity.Department;
import com.tci.assignment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tci/")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "department")
    public void addDepartment(Department department) {
        departmentService.addDepartment(department);
    }
}
