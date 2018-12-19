package com.example;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("Tom", "Tompson");
    }

    @Test
    public void test_ToString() {
        assertEquals("Person(firstName=Tom, lastName=Tompson)", person.toString());
    }

    @Test
    public void test_Get() {
        assertEquals("Tom", person.getFirstName());
    }
}