package com.example.spring.mvc.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

		@RequestMapping(value = "/",method = RequestMethod.GET)
		public String hello(ModelMap model) {

			model.addAttribute("name", "Hello World!");
			return "helloWorld";

		}
		
		@RequestMapping(value = "/hello",method = RequestMethod.GET)
		public ModelAndView helloName1(@RequestParam(value = "name", required = true) String name) {
			ModelAndView model = new ModelAndView();
			model.setViewName("helloWorld");
			model.addObject("name", "Hello "+name);
			return model;

		}
		
		@RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
		public ModelAndView helloName(@PathVariable("name") String name) {
			ModelAndView model = new ModelAndView();
			model.setViewName("helloWorld");
			model.addObject("name", "Hello "+name);
			return model;

		}
		
	

	}
