package com.example.checkpoint.service;

import com.example.checkpoint.model.Person;
import com.example.checkpoint.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(String name) {
        Person person = new Person();
        person.setName(name);
        person.setEntryTime(LocalDateTime.now());
        return personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
