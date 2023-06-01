package com.example.fourthassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.fourthassignment.entity.Employee;
import com.example.fourthassignment.service.EmployeeService;
import org.springframework.ui.Model;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	

	
	// handler method to handle list employees and return mode and view
	
		@GetMapping("/")
		public String createEmployeeForm(Model model) {
		
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
		
		}
		
		@GetMapping("/employees")
		public String listEmployees(Model model) {
			model.addAttribute("employees", employeeService.getAllEmployees());
			return "employees";
		}
		
		
		
		@PostMapping("/employees")
		public String saveEmployee(@ModelAttribute("employee") Employee employee) {
			employeeService.saveEmployee(employee);
			return "redirect:/employees";
		}
		
		@GetMapping("/employees/edit/{id}")
		public String editEmployeeForm(@PathVariable Long id, Model model) {
			model.addAttribute("employee", employeeService.getEmployeeById(id));
			return "edit_employee";
		}

		@PostMapping("/employees/{id}")
		public String updateEmployee(@PathVariable Long id,
				@ModelAttribute("employee")Employee employee,
				Model model) {
			
	
			Employee existingEmployee = employeeService.getEmployeeById(id);
			existingEmployee.setId(id);
			existingEmployee.setEmployeeId(employee.getEmployeeId());
			existingEmployee.setEmployeeName(employee.getEmployeeName());
			existingEmployee.setEmail(employee.getEmail());
			existingEmployee.setLocation(employee.getLocation());
			
			
			employeeService.updateEmployee(existingEmployee);
			return "redirect:/employees";		
		}
		
		// handler method to handle delete employee request
		
		@GetMapping("/employees/{id}")
		public String deleteEmployee(@PathVariable Long id) {
			employeeService.deleteEmployeeById(id);
			return "redirect:/employees";
		}

}
