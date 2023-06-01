package com.example.firstassignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankDetailsController {
	
	@RequestMapping("/")
	public String landingPage(){
		return "Landing Page";
	}
	
	@RequestMapping("/bankname")
	public String bankName() {
		return "ICICI Bank";
	}
	
	@RequestMapping("/address")
	public String bankAddress() {
		return "Guntur,Andhra Pradesh, India";
	}

}
