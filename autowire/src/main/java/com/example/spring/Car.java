package com.example.spring;

public class Car {

	private CarModel model;
	
	public String getModelName()
	{
		return model.getName();
	}
	
	public void setmodel(CarModel cartype)
	{
		this.model=cartype;
	}
}
