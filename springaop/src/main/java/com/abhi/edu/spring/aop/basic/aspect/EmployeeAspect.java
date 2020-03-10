package com.abhi.edu.spring.aop.basic.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice(){
        System.out.println("Executing Advice on getName()");
    }

    @Before("execution(* com.abhi.edu.springaop.service.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }
}