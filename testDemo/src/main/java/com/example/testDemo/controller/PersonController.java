package com.example.testDemo.controller;

import com.example.testDemo.entity.Person;
import com.example.testDemo.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    final
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

//    String name;
//    String family;
//    int age;
//    long cardId;

    @PostMapping(value = "/savePerson")
    public Person savePerson(@RequestParam String name, @RequestParam String family, @RequestParam int age, @RequestParam long cardId) {
        Person newP = new Person(name, family, age, cardId);
        return personService.save(newP);
    }

    @PostMapping(value = "/getAllPerson")
    public List<Person> getAllPersonList() {
        return personService.getAllPersons();
    }

    @PostMapping(value = "/deleteById")
    public String deleteById(@RequestParam int id) {
        return personService.deleteById(id);
    }


}
//    @PostMapping save

//    @PutMapping edit

//    @DeleteMapping delete

//    @GetMapping get
//------------------------------
//    RequestParam , PathVariable ,Requestbody