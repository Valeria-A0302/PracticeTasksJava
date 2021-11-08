package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStringTest {
    @Test
    public static void testStringCharacter() {
        String string = "This is string";
        MyString.stringCharacter(string);
    }

    @Test
    public static void testStringOfBytes() {
        String string = "Hello, world!";
        MyString.stringOfBytes(string);
        System.out.println();
        String newString = "Привет, мир!";
        MyString.stringOfBytes(newString);
    }

    @Test
    public static void testComparison() {
        MyString.comparison();
    }

    @Test
    public static void testPalindrome() {
        String string = "123321";
        Assert.assertTrue(MyString.palindrome(string));

        String newString = "123456";
        Assert.assertFalse(MyString.palindrome(newString));
    }

    @Test
    public static void testStringComparison() {
        String stringOne = "hello";
        String stringTwo = "WORLD";
        Assert.assertTrue(MyString.stringComparison(stringOne, stringTwo));
        Assert.assertFalse(MyString.stringComparison(null, stringTwo));
        Assert.assertFalse(MyString.stringComparison(null, null));
        Assert.assertFalse(MyString.stringComparison(stringOne, "HELLO"));
        Assert.assertFalse(MyString.stringComparison(stringOne, "hello"));
    }

    @Test
    public static void testScreening() {
        MyString.screening();
    }

    @Test
    public static void testIndexOfString() {
        Assert.assertEquals(MyString.indexOfString("понимать", "мать"), 4);
        Assert.assertEquals(MyString.indexOfString("абракадабра", "бра"), 1);
        Assert.assertEquals(MyString.indexOfString("абракадабра", "бам"), -1);
    }
}