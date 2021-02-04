package com.edu.abhi.SpringBoot.repository;

import com.edu.abhi.SpringBoot.entity.Book;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
  List<Book> findByTitle(String title);
}
