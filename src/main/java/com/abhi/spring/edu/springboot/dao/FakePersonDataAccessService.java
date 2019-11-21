package com.abhi.spring.edu.springboot.dao;

import com.abhi.spring.edu.springboot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personToBedetleted = selectPersonById(id);
        if (personToBedetleted.isPresent()) {
            DB.remove(personToBedetleted.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int UpdatePersonById(UUID id, Person newPerson) {
        selectPersonById(id)
                .map(person -> {
                    int indexOfPersonToBeUpdated = DB.indexOf(person);
                    if (indexOfPersonToBeUpdated >= 0) {
                        DB.set(indexOfPersonToBeUpdated, new Person(id, newPerson.getName()));
                        return 1;
                    }
                    return 0;
                }).orElse(0);
        return 0;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }
}
