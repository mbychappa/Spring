package com.example.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.Car;
import com.example.spring.Car1;
import com.example.spring.Car2;
import com.example.spring.CarModel;

public class TestCarConst {

	public static void main(String[] args)
	{
		try {
			ApplicationContext context = 
		             new ClassPathXmlApplicationContext("spring/beans.xml");
			
			
			/* For Testing Auto-wiring Constructor */ 
			Car2 car2=(Car2) context.getBean("Car2");
			System.out.println(car2.getModelName());
		  	
			
			}
			
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
