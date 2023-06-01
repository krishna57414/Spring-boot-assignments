package com.example.fifthassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.fifthassignment.repository.EmployeeRepository;

@SpringBootApplication
public class FifthAssignmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FifthAssignmentApplication.class, args);
	}

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
