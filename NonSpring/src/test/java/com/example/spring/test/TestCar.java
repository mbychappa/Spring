package com.example.spring.test;

import com.example.spring.Car;
import com.example.spring.CarModel;

public class TestCar {

	public static void main(String[] args)
	{
		Car car=new Car();
		CarModel model=car.buildCar("Benz");
		System.out.println("Car Model is:"+model.getName());
		
	}
}
