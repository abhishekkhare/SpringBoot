package com.abhi.spring.edu.springboot.dao;


import com.abhi.spring.edu.springboot.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
