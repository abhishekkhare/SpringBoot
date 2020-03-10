package com.abhi.edu.spring.aop.basic;


import com.abhi.edu.spring.aop.basic.service.EmployeeService;
import com.abhi.edu.spring.aop.basic.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
        StudentService studentService = ctx.getBean("studentService", StudentService.class);
        System.out.println("*****************Context Loaded*******************");


        System.out.println("From Main Employee:" + employeeService.getEmployee().getName());
        System.out.println("From Main: Student" + studentService.getStudent().getName());
        System.exit(0);
        employeeService.getEmployee().setName("Abhishek");

        employeeService.getEmployee().throwException();

        ctx.close();
    }
}