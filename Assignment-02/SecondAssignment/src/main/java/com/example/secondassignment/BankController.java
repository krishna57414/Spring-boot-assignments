package com.example.secondassignment;

import org.springframework.stereotype.Controller;
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

}
