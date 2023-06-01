package com.example.fourthassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fourthassignment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
