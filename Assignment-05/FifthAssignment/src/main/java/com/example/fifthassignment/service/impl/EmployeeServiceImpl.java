package com.example.fifthassignment.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fifthassignment.entity.Employee;
import com.example.fifthassignment.repository.EmployeeRepository;
import com.example.fifthassignment.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);
	}

}
