package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppContext {

	@Bean
	public Maruthi maruthi()
	{
		return new Maruthi();
	}
	
	@Bean
	public Benz benz()
	{
		return new Benz();
	}
	
	@Bean
	public Car car()
	{
		return new Car();
	}
	
}
