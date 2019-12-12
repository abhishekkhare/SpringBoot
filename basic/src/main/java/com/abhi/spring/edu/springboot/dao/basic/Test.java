package com.abhi.spring.edu.springboot.dao.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.abhi.spring.edu.springboot.dao.basic");
        context.refresh();

        EmployeeRepository repository = context.getBean(EmployeeRepository.class);

        // store
        repository.store(new Employee(1, "Abhishek", "SE"));
        repository.store(new Employee(2, "Roopali", "EM"));
        repository.store(new Employee(3, "Ishanvi", "CFO"));

        // retrieve
        Employee emp = repository.retrieve(1);
        System.out.println(emp);

        // search
        Employee cfo = repository.search("Ishanvi");
        System.out.println(cfo);

        // delete
        Employee editor = repository.delete(2);
        System.out.println(editor);

        // close the spring context
        context.close();
    }
}
