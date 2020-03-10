package com.abhi.spring.edu.springboot.simpleapplication.persistence.repo;

import com.abhi.spring.edu.springboot.simpleapplication.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
