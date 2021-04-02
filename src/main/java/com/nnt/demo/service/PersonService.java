package com.nnt.demo.service;

import com.nnt.demo.model.Person;
import com.nnt.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public void save(Person p){
        personRepository.save(p);
    }
}
