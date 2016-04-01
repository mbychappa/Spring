package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car2 {

	private CarModel model;
	
	@Autowired
	public Car2(CarModel model)
	{
		this.model=model;
	}
	
	
	public String getModelName()
	{
		return model.getName();
	}
	
	
}
