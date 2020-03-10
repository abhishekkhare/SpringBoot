package com.abhi.spring.edu.springboot.dao;

import com.abhi.spring.edu.springboot.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByName(String name);
}