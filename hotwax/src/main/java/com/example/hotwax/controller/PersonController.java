package com.example.hotwax.controller;

import com.example.hotwax.entity.Person;
import com.example.hotwax.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/")
    public void addPerson(@RequestBody Person person){
        personService.AddPerson(person);
    }

}
