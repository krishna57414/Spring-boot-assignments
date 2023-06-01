package com.example.fifthassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fifthassignment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
