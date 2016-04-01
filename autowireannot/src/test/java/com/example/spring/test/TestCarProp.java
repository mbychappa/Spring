package com.example.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.Car;
import com.example.spring.Car1;
import com.example.spring.CarModel;

public class TestCarProp {

	public static void main(String[] args)
	{
		try {
			ApplicationContext context = 
		             new ClassPathXmlApplicationContext("spring/beans.xml");
			
			/* For Testing Auto-wiring Property */
			Car car=(Car) context.getBean("Car");
			System.out.println(car.getModelName());
			
			}
			
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
