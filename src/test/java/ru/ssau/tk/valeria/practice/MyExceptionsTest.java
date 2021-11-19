package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

public class MyExceptionsTest {
    @Test
    public static void testExceptionForPerson() {
        Person person = new Person("Атапина", "Валерия");
        Assert.assertEquals(MyExceptions.exceptionForPerson(person), "Это Атапина Валерия");
        Assert.assertThrows(NullPointerException.class, () -> MyExceptions.exceptionForPerson(null));
    }

    @Test
    public static void testArrayOfCharacters() {
        String[] strings = new String[]{"яблоко", "лёд", "груша"};
        Assert.assertEquals(MyExceptions.arrayOfCharacters(strings, 2), new char[]{'л', 'д', 'у'});
        Assert.assertEquals(MyExceptions.arrayOfCharacters(strings, 1), new char[]{'б', 'ё', 'р'});
        Assert.assertThrows(NullPointerException.class, () -> System.out.println(MyExceptions.arrayOfCharacters(null, 1)));
        Assert.assertThrows(NullPointerException.class, () -> System.out.println(MyExceptions.arrayOfCharacters(new String[]{"asdad", null, "dada"}, 4)));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> System.out.println(MyExceptions.arrayOfCharacters(new String[]{"asdad", null, "dada"}, -5)));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> System.out.println(MyExceptions.arrayOfCharacters(new String[]{"asdad", null, "dada"}, 10)));
    }

    @Test
    public static void testPositionOfCharacter() {
        String[] strings = new String[]{"яблоко", "лёд", "груша"};
        Assert.assertEquals(MyExceptions.positionOfCharacter(strings, 1, 2), 'д');
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> System.out.println(MyExceptions.positionOfCharacter(strings, 10, 2)));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> System.out.println(MyExceptions.positionOfCharacter(strings, 1, 12)));
    }

    @Test
    public static void testConvertingStringToInteger() {
        Assert.assertEquals(MyExceptions.convertingStringToInteger("6", "2"), 3);
        Assert.assertThrows(NumberFormatException.class, () -> System.out.println(MyExceptions.convertingStringToInteger("f", "1")));
        Assert.assertThrows(ArithmeticException.class, () -> System.out.println(MyExceptions.convertingStringToInteger("6", "0")));
    }

    @Test
    public static void testSerializeForPerson() {
        Assert.assertThrows(NotSerializableException.class, () -> MyExceptions.serializeForPerson(new ByteArrayOutputStream(), new Object()));
        Assert.assertThrows(FileNotFoundException.class, () -> MyExceptions.serializeForPerson(new FileOutputStream(""), new Object()));
        Assert.assertThrows(FileNotFoundException.class, () -> MyExceptions.serializeForPerson(new FileOutputStream(""), new Person()));
    }

    @Test
    public static void testCheckingMethod() {
        try {
            MyExceptions.checkingMethod();
        } catch (SecondExceptionClass secondExceptionClass) {
            Assert.assertTrue(secondExceptionClass.getCause() instanceof FirstExceptionClass);
        }
    }
}