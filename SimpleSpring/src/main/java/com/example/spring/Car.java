package com.example.spring;

public class Car {

	private CarModel model;
	
	public CarModel buildCar(String car)
	{
		if (car.equalsIgnoreCase("Maruthi"))
		{
			model=new Maruthi();
		}
		
		else if (car.equalsIgnoreCase("Benz"))
		{
			model=new Benz();
		}
		
		//this.model=CarFactory.getCarModel(car);
		return this.model;
	}
}
