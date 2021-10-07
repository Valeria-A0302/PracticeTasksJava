package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IdenticalOperationTest {

    final static double number = 123.0;
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
    IdenticalOperation iTest = new IdenticalOperation();

    @Test
    public void applyTest() {
        Assert.assertEquals(iTest.apply(number), 123.0);
        Assert.assertEquals(iTest.apply(POSITIVE_INFINITY), POSITIVE_INFINITY);
        Assert.assertEquals(iTest.apply(NEGATIVE_INFINITY), NEGATIVE_INFINITY);
        Assert.assertEquals(iTest.apply(0.0), 0.0);
    }

    @Test
    public void applyTripleTest() {
        Assert.assertEquals(iTest.applyTriple(number), 123.0);
        Assert.assertEquals(iTest.applyTriple(POSITIVE_INFINITY), POSITIVE_INFINITY);
        Assert.assertEquals(iTest.applyTriple(NEGATIVE_INFINITY), NEGATIVE_INFINITY);
        Assert.assertEquals(iTest.applyTriple(0.0), 0.0);
    }
}