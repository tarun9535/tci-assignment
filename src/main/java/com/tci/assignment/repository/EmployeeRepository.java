package com.tci.assignment.repository;

import com.tci.assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM employee WHERE DATE(joining_date) <= DATE(:joiningDate) AND DATE(exit_date) >= DATE(:joiningDate)")
    List<Employee> findEligibleEmployeeForBonus(Date joiningDate);
}
