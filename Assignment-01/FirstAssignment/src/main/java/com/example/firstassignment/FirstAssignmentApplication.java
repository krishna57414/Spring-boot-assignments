package com.example.firstassignment;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class FirstAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAssignmentApplication.class, args);
	}	
	@Bean
	CommandLineRunner getBeans(ApplicationContext appContext) {
		return args ->{			
			String[] beans = ((ListableBeanFactory) appContext).getBeanDefinitionNames();
				
			System.out.println("Beans From Spring Boot : ");
			
			Arrays.sort(beans);
		
		for(String bean : beans) {
			System.out.println(bean);
			}
		};
	}
}