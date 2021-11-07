package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyLinesTest {
    @Test
    public static void testStringCharacter() {
        String string = "This is string";
        MyLines.stringCharacter(string);
    }

    @Test
    public static void testStringOfBytes() {
        String string = "Hello, world!";
        MyLines.stringOfBytes(string);
        System.out.println();
        String newString = "Привет, мир!";
        MyLines.stringOfBytes(newString);
    }

    @Test
    public static void testComparison() {
        MyLines.comparison();
    }

    @Test
    public static void testPalindrome() {
        String string = "123321";
        Assert.assertTrue(MyLines.palindrome(string));

        String newString = "123456";
        Assert.assertFalse(MyLines.palindrome(newString));
    }
}