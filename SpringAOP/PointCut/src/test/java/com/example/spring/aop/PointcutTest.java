package com.example.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointcutTest {

	public static void main(String[] args)
	{
		try {
			ApplicationContext context = 
		             new ClassPathXmlApplicationContext("spring/beans.xml");
					
			EmployeeService empSrv=(EmployeeService) context.getBean("employeeService");
			Employee emp=empSrv.getEmployee();
			System.out.println(emp.getName());
			emp.setName("John");
		  
			}
			
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
