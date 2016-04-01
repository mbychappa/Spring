package com.example.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.Car;
import com.example.spring.Car1;
import com.example.spring.CarModel;

public class TestCarMethod {

	public static void main(String[] args)
	{
		try {
			ApplicationContext context = 
		             new ClassPathXmlApplicationContext("spring/beans.xml");
			
			/* For Testing Auto-wiring Method */
			Car1 car1=(Car1) context.getBean("car1");
			System.out.println(car1.getModelName());
		  	
			
			}
			
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
