package com.example;

public class PersonService {
    public String getFirstLetterName() {
        Person person = new Person("Tom", "Tompson");
        return person.getFirstName().substring(0,1);
    }
}
