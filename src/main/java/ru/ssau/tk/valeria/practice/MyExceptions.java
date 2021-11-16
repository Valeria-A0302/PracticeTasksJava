package ru.ssau.tk.valeria.practice;

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
}
