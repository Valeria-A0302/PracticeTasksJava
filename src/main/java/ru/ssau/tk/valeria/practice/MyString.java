package ru.ssau.tk.valeria.practice;

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
        String stringTwo = new String(stringOne);
        System.out.println(stringTwo.equals(stringOne));
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
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }
}
