package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Maruthi model;
	
	public String getModelName()
	{
		return model.getName();
	}
	
}
