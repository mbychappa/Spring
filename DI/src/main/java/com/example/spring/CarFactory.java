package com.example.spring;

public class CarFactory {

	public static CarModel getCarModel(String cartype)
	{
		System.out.println("Car Factory called for "+cartype);
		
		CarModel car;
		
		if (cartype.equalsIgnoreCase("Maruthi"))
		{
			car=new Maruthi();
		}
		
		else if (cartype.equalsIgnoreCase("Benz"))
		{
			car=new Benz();
		}
		
		else
		{
			car=null;
		}
		
		return car;
	}
}
