package com.emanueldev.peoplemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("api/v1/people")
public class PersonController {

    @GetMapping
    public String fetchPeople() {
        return "Busquem conhecimento";
    }
}
