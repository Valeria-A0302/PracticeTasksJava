package ru.ssau.tk.valeria.practice;

public class MyLines {

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
}
