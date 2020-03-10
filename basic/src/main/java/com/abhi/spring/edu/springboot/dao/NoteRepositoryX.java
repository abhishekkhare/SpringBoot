package com.abhi.spring.edu.springboot.dao;


import com.abhi.spring.edu.springboot.model.NoteX;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepositoryX extends JpaRepository<NoteX, Long> {

}
