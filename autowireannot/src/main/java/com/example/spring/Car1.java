package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car1 {

	private CarModel model;
	
	public String getModelName()
	{
		return model.getName();
	}
	
	@Autowired
	public void setmodel(CarModel model)
	{
		this.model=model;
	}
}
