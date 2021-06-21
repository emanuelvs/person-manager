package com.emanueldev.peoplemanagement.service;

import com.emanueldev.peoplemanagement.dto.request.PersonDTO;
import com.emanueldev.peoplemanagement.entity.Person;
import com.emanueldev.peoplemanagement.entity.Phone;
import com.emanueldev.peoplemanagement.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public String create(PersonDTO person) {
        Person saved = personRepository.save(new Person(
                person.getFirstName(),
                person.getLastName(),
                person.getCpf(),
                LocalDate.parse(person.getBirthDate()),
                person.getPhones().stream().map(p -> new Phone(p.getType(), p.getNumber())).collect(Collectors.toList())
        ));

        return saved.getId().toString();
    }

    public List<Person> fetchAll() {

        return personRepository.findAll();
    }
}
