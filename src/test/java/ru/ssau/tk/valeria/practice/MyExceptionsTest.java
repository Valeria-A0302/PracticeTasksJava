package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyExceptionsTest {
    @Test
    public static void testExceptionForPerson() {
        Person person = new Person("Атапина", "Валерия");
        Assert.assertEquals(MyExceptions.exceptionForPerson(person), "Это Атапина Валерия");
        Assert.assertThrows(NullPointerException.class, () -> MyExceptions.exceptionForPerson(null));
    }
}