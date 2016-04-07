package com.example.spring.mvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring.mvc.model.Customer;

@Controller
public class CustomerController {
	
	
	@RequestMapping(value="/customer", method = RequestMethod.GET)
	public ModelAndView customer(){
		return new ModelAndView("Customer","customer",new Customer());
	}
	
	
	@RequestMapping(value="/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer, ModelMap model) {
		model.addAttribute("customerName", customer.getcustomerName());
		return "customersuccess";
	}	
}