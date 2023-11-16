package com.tci.assignment.service;

import com.tci.assignment.entity.Department;
import com.tci.assignment.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }
}
