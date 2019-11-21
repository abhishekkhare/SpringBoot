package com.abhi.spring.edu.springboot.dao;

import com.abhi.spring.edu.springboot.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    int deletePersonById(UUID id);

    int UpdatePersonById(UUID id, Person newPerson);

    Optional<Person> selectPersonById(UUID id);
}
