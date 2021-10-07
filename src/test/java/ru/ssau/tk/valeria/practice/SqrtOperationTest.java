package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtOperationTest {
    final static double number = 256.0;
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
    SqrtOperation iTest = new SqrtOperation();

    @Test
    public void applyTest() {
        Assert.assertEquals(iTest.apply(number), 16.0);
        Assert.assertEquals(iTest.apply(POSITIVE_INFINITY), POSITIVE_INFINITY);
        Assert.assertEquals(iTest.apply(NEGATIVE_INFINITY), POSITIVE_INFINITY - POSITIVE_INFINITY);
        Assert.assertEquals(iTest.apply(0.0), 0.0);
    }

    @Test
    public void applyTripleTest() {
        Assert.assertEquals(iTest.applyTriple(number), 2.0);
        Assert.assertEquals(iTest.applyTriple(POSITIVE_INFINITY), POSITIVE_INFINITY);
        Assert.assertEquals(iTest.applyTriple(NEGATIVE_INFINITY), POSITIVE_INFINITY - POSITIVE_INFINITY);
        Assert.assertEquals(iTest.applyTriple(0.0), 0.0);
    }

}