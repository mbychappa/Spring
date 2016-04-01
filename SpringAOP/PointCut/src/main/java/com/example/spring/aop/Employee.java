package com.example.spring.aop;

public class Employee {

	private String name;
    
    public String getName() throws Exception {
    	/*
    	if (name.equalsIgnoreCase("jimmy"))
    		throw new Exception("Name cannot be Jimmy");
    	*/	
        return name;
    }
 
    public void setName(String nm) {
        this.name=nm;
    }
     
    public void throwException(){
        throw new RuntimeException("Dummy Exception");
    }
}
