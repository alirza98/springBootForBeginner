package com.example.testDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    int id;
    String name;
    String family;
    int age;
    long cardId;

    public Person(String name, String family, int age, long cardId) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.cardId = cardId;
    }
}
