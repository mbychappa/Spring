package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car1 {

	private CarModel model;
	
	public String getModelName()
	{
		return model.getName();
	}
	
	@Autowired
	public void setmodel(Maruthi model)
	{
		this.model=model;
	}
}
