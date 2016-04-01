package com.example.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
 
@Aspect
public class EmployeeAspect {
 
    @Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }
     
    @Before("execution(* com.example.spring.aop.*Service.get*())")
    public void getAllAdvice(){
        System.out.println("Executing Advice on Service method get*");
    }
}
