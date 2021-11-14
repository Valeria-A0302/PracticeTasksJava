package ru.ssau.tk.valeria.practice;

import java.nio.charset.Charset;

import static java.lang.String.join;

public class MyString {

    public static void stringCharacter(String string) {
        for (int element = 0; element < string.length(); element++) {
            System.out.println(string.charAt(element));
        }
    }

    public static void stringOfBytes(String string) {
        byte[] newString = string.getBytes();
        for (int i : newString) {
            System.out.println(i);
        }
    }

    public static void comparison() {
        String stringOne = "Hello!";
        System.out.println(stringOne);
    }

    public static boolean palindrome(String string) {
        String newString = new String(new StringBuilder(string).reverse());
        return string.equals(newString);
    }

    public static boolean stringComparison(String stringOne, String stringTwo) {
        if (stringOne == null || stringTwo == null) {
            return false;
        }
        return !stringOne.equals(stringTwo) && !stringOne.equalsIgnoreCase(stringTwo);
    }

    public static void screening() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }

    public static int indexOfString(String stringOne, String stringTwo) {
        return stringOne.indexOf(stringTwo);
    }

    public static int indexOfStringTwo(String stringOne, String stringTwo) {
        return stringOne.indexOf(stringTwo, stringOne.length() / 2);
    }

    public static int lastIndexOfString(String stringOne, String stringTwo) {
        return stringOne.indexOf(stringTwo);
    }

    public static int postfixAndPrefix(String[] string, String prefix, String postfix) {
        int count = 0;
        for (String element : string) {
            if (element.startsWith(prefix) && element.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public static int numberOfRows(String[] string, String prefix, String postfix) {
        int count = 0;
        String element;
        for (String index : string) {
            element = index.trim();
            if (element.startsWith(prefix) && element.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public static String replacingString(String stringOne, String stringTwo, String stringThree) {
        for (int i = 0; i < 10; i++) {
            if (stringOne.contains(stringTwo)) {
                stringOne = stringOne.replaceAll(stringTwo, stringThree);
            }
        }
        return stringOne;
    }

    public static String substring(String string, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > string.length()) {
            to = string.length();
        }
        if (to <= from) {
            return "";
        }
        return string.substring(from, to);
    }

    public static void printObject(Object object) {
        System.out.println("Описание объекта: ");
        System.out.println(object);
    }

    public static String[] arrayString(String string) {
        String[] array = string.split(" ");
        for (int s = 0; s < array.length; s++) {
            if (array[s].equals("")) {
                continue;
            }
            array[s] = array[s].substring(0, 1).toUpperCase() + array[s].substring(1);
        }
        return array;
    }

    public static String fromArrayToString(String[] array) {
        return join(", ", array);
    }

    public static String replacingCharacterWithIndex(String string) {
        StringBuilder stringOne = new StringBuilder(string);
        for (int element = 0; element < stringOne.length(); element++) {
            if (element % 2 == 0) {
                stringOne.replace(element, element + 1, Integer.toString(element));
            }
        }
        stringOne.reverse();
        return stringOne.toString();
    }

    public static String stringOfNumbers(int number) {
        StringBuilder string = new StringBuilder();
        for (int element = 0; element < number; element++) {
            string.append(element).append(" ");
        }
        return string.toString();
    }

    public static void defaultEncoding() {
        System.out.println(Charset.defaultCharset());
    }

    public static String encodings(String stringOne, Charset encodingOne, Charset encodingTwo) {
        byte[] stringTwo = stringOne.getBytes(encodingOne);
        return new String(stringTwo, encodingTwo);
    }
}
