package com.abhi.spring.edu.springboot.dao.basic;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository implements FakeDbInterface<Employee> {
    private Map<Integer, Employee> repository;

    public EmployeeRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public void store(Employee emp) {
        repository.put(emp.getId(), emp);
    }

    @Override
    public Employee retrieve(int id) {
        return repository.get(id);
    }

    @Override
    public Employee search(String name) {
        Collection<Employee> emps = repository.values();
        for (Employee emp : emps) {
            if (emp.getName().equalsIgnoreCase(name))
                return emp;
        }
        return null;
    }

    @Override
    public Employee delete(int id) {
        Employee e = repository.get(id);
        this.repository.remove(id);
        return e;
    }
}
