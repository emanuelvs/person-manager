package com.emanueldev.peoplemanagement.controller;

import com.emanueldev.peoplemanagement.service.PersonService;
import com.emanueldev.peoplemanagement.entity.Person;
import com.emanueldev.peoplemanagement.request.PersonRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/people")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> fetchPeople() {
        return personService.fetchAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createPerson(@RequestBody PersonRequest req) {

        return personService.create(req);
    }

}
