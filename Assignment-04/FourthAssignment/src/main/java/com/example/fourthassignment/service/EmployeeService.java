package com.example.fourthassignment.service;

import java.util.List;

import com.example.fourthassignment.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();

	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long employeeId);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long employeeId);

}
