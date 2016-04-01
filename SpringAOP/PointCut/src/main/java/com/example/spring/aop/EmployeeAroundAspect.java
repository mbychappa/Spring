package com.example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
 
@Aspect
public class EmployeeAroundAspect {
 
	@Around("getNamePointcut()")
    //Same as @AfterReturning("execution(public String getName())")
    public Object getNameAdvice(ProceedingJoinPoint pjp){
        System.out.println("Executing Around Advice on getName()");
        System.out.println("Before invoking getName() method");
        Object value = null;
        try {
            value = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After invoking getName() method. Return value="+value);
        return value;
    }
    
    @Pointcut("execution(public String getName())")
    public void getNamePointcut(){}
    
}
