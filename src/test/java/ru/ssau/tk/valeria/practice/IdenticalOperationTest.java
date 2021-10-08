package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IdenticalOperationTest {

    IdenticalOperation identicalTest = new IdenticalOperation();

    @Test
    public void applyTest() {
        Assert.assertEquals(identicalTest.apply(123.0), 123.0);
        Assert.assertEquals(identicalTest.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(identicalTest.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        Assert.assertEquals(identicalTest.apply(Double.NaN), Double.NaN);
    }

    @Test
    public void applyTripleTest() {
        Assert.assertEquals(identicalTest.applyTriple(123.0), 123.0);
        Assert.assertEquals(identicalTest.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(identicalTest.applyTriple(Double.NEGATIVE_INFINITY),Double.NEGATIVE_INFINITY);
        Assert.assertEquals(identicalTest.applyTriple(Double.NaN), Double.NaN);
    }
}