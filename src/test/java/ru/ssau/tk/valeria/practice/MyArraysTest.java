package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.valeria.practice.MyArrays.*;

public class MyArraysTest {
    @Test
    public static void testSize() {
        Assert.assertEquals(size(13).length, 13);
        Assert.assertEquals(size(1).length, 1);
        Assert.assertEquals(size(0).length, 0);
    }

    @Test
    public static void testGenerator() {
        Assert.assertEquals(generator(4)[0], 2);
        Assert.assertEquals(generator(4)[1], 1);
        Assert.assertEquals(generator(4)[2], 1);
        Assert.assertEquals(generator(4)[3], 2);
    }

    @Test
    public static void testOddArray() {
        Assert.assertEquals(oddArray(7)[0], 1);
        Assert.assertEquals(oddArray(7)[1], 3);
        Assert.assertEquals(oddArray(7)[2], 5);
        Assert.assertEquals(oddArray(7)[3], 7);
        Assert.assertEquals(oddArray(7)[4], 9);
        Assert.assertEquals(oddArray(7)[5], 11);
        Assert.assertEquals(oddArray(7)[6], 13);
    }

    @Test
    public static void testEvenArray() {
        Assert.assertEquals(evenArray(7)[0], 2);
        Assert.assertEquals(evenArray(7)[1], 4);
        Assert.assertEquals(evenArray(7)[2], 6);
        Assert.assertEquals(evenArray(7)[3], 8);
        Assert.assertEquals(evenArray(7)[4], 10);
        Assert.assertEquals(evenArray(7)[5], 12);
        Assert.assertEquals(evenArray(7)[6], 14);
    }
}