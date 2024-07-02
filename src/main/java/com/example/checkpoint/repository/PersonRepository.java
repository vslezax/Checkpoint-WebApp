package com.example.checkpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.checkpoint.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
