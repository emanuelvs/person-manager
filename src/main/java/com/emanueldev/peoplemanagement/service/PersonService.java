package com.emanueldev.peoplemanagement.service;

import com.emanueldev.peoplemanagement.entity.Person;
import com.emanueldev.peoplemanagement.repository.PersonRepository;
import com.emanueldev.peoplemanagement.request.PersonRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public String create(PersonRequest person) {
        Person saved = personRepository.save(new Person(
                person.getFirstName(),
                person.getLastName(),
                person.getCpf(),
                LocalDate.parse(person.getBirthDate()),
                person.getPhones()
        ));

        return saved.getId().toString();
    }

    public List<Person> fetchAll() {

        return personRepository.findAll();
    }
}
