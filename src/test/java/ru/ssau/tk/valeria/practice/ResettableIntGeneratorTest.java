package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResettableIntGeneratorTest {
    static ResettableIntGenerator object = new ResettableIntGenerator();

    @Test
    public static void testNextInt() {
        Assert.assertEquals(object.nextInt(), 0);
    }

    @Test
    public static void testReset() {
        object.reset();
        Assert.assertEquals(ResettableIntGenerator.number, 0);
    }
}