package com.example.thirdassignment;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
		
		@RequestMapping("/bank")
		public String bankBranches() {
			
			return "bank";
		}
		
		@RequestMapping("/bankservices")
		public String bankServices() {
			
			return "bankservices";
		}
		@RequestMapping("/health")
		public String getHealth(Model model) {
		    // Implement your logic to check the availability of services
		    boolean isApplicationUp = checkServiceAvailability(); // Assuming you have a method to check service availability
		    
		    model.addAttribute("status", isApplicationUp ? "UP" : "DOWN");
		    
		    return "status";
		}

		private boolean checkServiceAvailability() {
		    // Implement your logic to check the availability of services
		    // For example, you can check if all services are present
		    
		    List<String> services = Arrays.asList(
		            "Auto loans",
		            "Credit and debit cards",
		            "Personal loans",
		            "Home loans",
		            "Gold loans",
		            "Mortgages",
		            "Commercial vehicles finance",
		            "Agri and tractor loans",
		            "Savings account",
		            "Current account"
		    );

		    List<String> availableServices = getAvailableServices(); // Assuming this method returns a list of available services
		    
		    boolean isApplicationUp = availableServices.containsAll(services);
		    
		    return isApplicationUp;
		}

		private List<String> getAvailableServices() {
		    // Implement your logic to fetch and return the available services
		    // For example, you can query a database or call an API to get the services provided by the bank
		    
			 List<String> availableServices = new ArrayList<>();
			    availableServices.add("Auto loans");
			    availableServices.add("Credit and debit cards");
			    availableServices.add("Personal loans");
			    availableServices.add("Home loans");
			    availableServices.add("Gold loans");
			    availableServices.add("Mortgages");
			    availableServices.add("Commercial vehicles finance");
			    availableServices.add("Agri and tractor loans");
			    availableServices.add("Savings account");
			    availableServices.add("Current account");
		    		return availableServices;
		}




	}