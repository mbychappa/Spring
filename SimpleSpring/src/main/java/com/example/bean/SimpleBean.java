package com.example.bean;

public class SimpleBean {

	public String name;

	public SimpleBean()
	{
		System.out.println("SimpleBean Constructor Called");
		name="default-name";
	}
	
	public SimpleBean(String name)
	{
	this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void init()
	{
		System.out.println("SimpleBean Init method called");
	}
	
	public void destroy()
	{
		System.out.println("SimpleBean Destroy method called");
	}
}
