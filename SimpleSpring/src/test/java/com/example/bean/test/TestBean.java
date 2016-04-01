package com.example.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.SimpleBean;

public class TestBean {

	public static void main(String[] args)
	{
		try {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("spring/beans.xml");
				
		SimpleBean bean=(SimpleBean) context.getBean("SimpleBean");
		System.out.println(bean.getName());
	    
		//((AbstractApplicationContext) context).registerShutdownHook();

		}
		
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
