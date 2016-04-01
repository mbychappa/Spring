package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	@Autowired
	private CarModel model;
	
	public String getModelName()
	{
		return model.getName();
	}
	
}
