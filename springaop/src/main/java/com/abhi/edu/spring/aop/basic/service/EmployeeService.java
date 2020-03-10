package com.abhi.edu.spring.aop.basic.service;


import com.abhi.edu.spring.aop.basic.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private Employee employee;

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee e){
        this.employee=e;
    }
}
