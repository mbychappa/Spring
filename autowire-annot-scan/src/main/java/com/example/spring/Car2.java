package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car2 {

	private CarModel model;
	
	@Autowired
	public Car2(Maruthi model)
	{
		this.model=model;
	}
	
	
	public String getModelName()
	{
		return model.getName();
	}
	
	
}
