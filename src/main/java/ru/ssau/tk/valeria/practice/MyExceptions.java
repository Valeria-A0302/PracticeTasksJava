package ru.ssau.tk.valeria.practice;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyExceptions {
    public static String exceptionForPerson(Person person) {
        return person.toString();
    }

    public static char[] arrayOfCharacters(String[] string, int n) {
        char[] array = new char[string.length];
        for (int element = 0; element < string.length; element++) {
            array[element] = string[element].charAt(n);
        }
        return array;
    }

    public static char positionOfCharacter(String[] string, int m, int n) {
        return string[m].charAt(n);
    }

    public static int convertingStringToInteger(String stringOne, String stringTwo) {
        return Integer.parseInt(stringOne) / Integer.parseInt(stringTwo);
    }

    public static void serializeForPerson(OutputStream outputStream, Object object) throws IOException {
        ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);
        objectStream.writeObject(object);
    }

    public static void checkingFirstException() throws FirstExceptionClass {
        throw new FirstExceptionClass();
    }

    public static void checkingMethod() {
        try {
            checkingFirstException();
        } catch (FirstExceptionClass firstExceptionClass) {
            throw new SecondExceptionClass(firstExceptionClass);
        }
    }
}
