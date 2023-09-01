package com.example.testDemo.service;

import com.example.testDemo.entity.Person;
import com.example.testDemo.repo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    final
    PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    public Person save(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getAllPersons(){
        List<Person> personList = personRepo.findAll();
        return personList;
    }

    public String deleteById(int id){
        personRepo.deleteById(id);
        return "person with id : " + id + " deleted" ;
    }
}
