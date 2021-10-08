package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TangentOperationTest {
    TangentOperation tangentTest = new TangentOperation();

    @Test
    public void applyTest() {
        Assert.assertEquals(tangentTest.apply(0), 0.0);
        Assert.assertEquals(tangentTest.apply(Double.POSITIVE_INFINITY), Double.NaN);
        Assert.assertEquals(tangentTest.apply(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(tangentTest.apply(Double.NaN), Double.NaN);
    }

    @Test
    public void applyTripleTest() {
        Assert.assertEquals(tangentTest.applyTriple(0), 0.0);
        Assert.assertEquals(tangentTest.applyTriple(Double.POSITIVE_INFINITY), Double.NaN);
        Assert.assertEquals(tangentTest.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(tangentTest.applyTriple(Double.NaN), Double.NaN);
    }

}