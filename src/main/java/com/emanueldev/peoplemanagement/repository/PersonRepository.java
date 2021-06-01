package com.emanueldev.peoplemanagement.repository;

import com.emanueldev.peoplemanagement.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
}
