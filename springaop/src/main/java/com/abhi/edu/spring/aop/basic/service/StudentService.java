package com.abhi.edu.spring.aop.basic.service;


import com.abhi.edu.spring.aop.basic.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
