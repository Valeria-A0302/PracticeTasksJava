package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtOperationTest {
    SqrtOperation sqrtTest = new SqrtOperation();

    @Test
    public void applyTest() {
        Assert.assertEquals(sqrtTest.apply(256.0), 16.0);
        Assert.assertEquals(sqrtTest.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(sqrtTest.apply(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(sqrtTest.apply(Double.NaN), Double.NaN);
    }

    @Test
    public void applyTripleTest() {
        Assert.assertEquals(sqrtTest.applyTriple(256.0), 2.0);
        Assert.assertEquals(sqrtTest.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(sqrtTest.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(sqrtTest.applyTriple(Double.NaN), Double.NaN);
    }

}