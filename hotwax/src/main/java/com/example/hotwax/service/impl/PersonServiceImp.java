package com.example.hotwax.service.impl;

import com.example.hotwax.entity.Person;
import com.example.hotwax.repositart.PersonRepository;
import com.example.hotwax.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepository personRepo;

    public void AddPerson(Person person){
        personRepo.save(person);
    }
}
