package com.example.spring;

public class Car {

	private CarModel model;
	
	public Car(CarModel cartype)
	{
		this.model=cartype;
	}
	
	public String getModelName()
	{
		return model.getName();
	}
	
	public void setmodel(CarModel cartype)
	{
		this.model=cartype;
	}
}
