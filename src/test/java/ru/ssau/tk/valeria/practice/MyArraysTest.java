package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.valeria.practice.MyArrays.*;

public class MyArraysTest {
    @Test
    public static void testSize(){
        Assert.assertEquals(size(13).length, 13);
        Assert.assertEquals(size(1).length, 1);
        Assert.assertEquals(size(0).length, 0);
    }

}