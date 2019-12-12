package com.abhi.spring.edu.springboot.dao.basic;

public interface FakeDbInterface<T> {

    public void store(T t);

    public T retrieve(int id);

    public T search(String name);

    public T delete(int id);
}