package ru.ssau.tk.valeria.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.*;

public class PersonTest {
    @Test
    public static void testingSettersAndGetters() {
        Person person = new Person();
        person.setFirstName("Valeria");
        person.setLastName("Atapina");
        person.setPassportId(1234);

        Assert.assertEquals(person.getFirstName(), "Valeria");
        Assert.assertEquals(person.getLastName(), "Atapina");
        Assert.assertEquals(person.getPassportId(), 1234);
    }


}