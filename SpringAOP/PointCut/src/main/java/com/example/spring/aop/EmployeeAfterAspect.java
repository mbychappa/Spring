package com.example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
 
@Aspect
public class EmployeeAfterAspect {
 
	@After("getNamePointcut()")
    //Same as @After("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing After Advice on getName()");
    }
     
	 @After("getAllmethodsPointcut()")
	  //Same as @After("execution(* com.example.spring.aop.*.*(..))")
	  public void getAllMethodsAdvice(){
	        System.out.println("Executing Advice for all Methods");
	    }
	 
    @After("getAllServicemethodsPointcut()")
    //Same as @After("execution(* com.example.spring.aop.*Service.*())")
    public void getAllServiceMethodsAdvice(){
        System.out.println("Executing Advice on all EmployeeService methods");
    }
    
    @After("getSetStringemethodsPointcut()")
    public void getSetStringemethodsAdvice(){
        System.out.println("Executing Advice on all set(String) methods");
    }
    
    
    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}
    
    @Pointcut("within(com.example.spring.aop.*)")
    public void getAllmethodsPointcut(){}
    
    @Pointcut("target(com.example.spring.aop.EmployeeService)")
    public void getAllServicemethodsPointcut(){}
    
    @Pointcut("args(String)")
    public void getSetStringemethodsPointcut(){}
    
    
}
