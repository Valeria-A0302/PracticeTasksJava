package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NamedPointTest {
    @Test
    public static void testSetNameAndGetName() {
        NamedPoint point = new NamedPoint(1.2, 3.4, 5.6, "Origin");
        point.setName(1.2, 3.4, 5.6, "Origin");
        Assert.assertEquals(point.getName(), "Origin");
        Assert.assertEquals(point.getX(), 1.2);
        Assert.assertEquals(point.getY(), 3.4);
        Assert.assertEquals(point.getZ(), 5.6);
    }

    @Test
    public static void testNamedPointWithoutParameters() {
        NamedPoint point = new NamedPoint();
        Assert.assertEquals(point.getName(), "Origin");
        Assert.assertEquals(point.getX(), 0.0);
        Assert.assertEquals(point.getY(), 0.0);
        Assert.assertEquals(point.getZ(), 0.0);
    }

    @Test
    public static void testNamedPointWithThreeParameters() {
        NamedPoint point = new NamedPoint(1., 3., 5.);
        Assert.assertEquals(point.getX(), 1.);
        Assert.assertEquals(point.getY(), 3.);
        Assert.assertEquals(point.getZ(), 5.);
    }

    @Test
    public static void testNamedPointWithFourParameters() {
        NamedPoint point = new NamedPoint(0.1, 0.2, 0.3, "Fake");
        Assert.assertEquals(point.getX(), 0.1);
        Assert.assertEquals(point.getY(), 0.2);
        Assert.assertEquals(point.getZ(), 0.3);
        Assert.assertEquals(point.getName(), "Fake");
    }

    @Test
    public static void testReset() {
        NamedPoint object = new NamedPoint();
        object.reset();
        Assert.assertEquals(object.getName(), "Absent");
    }

    @Test
    public static void testToString() {
        NamedPoint point = new NamedPoint(1, 2, 3, "Point");
        Assert.assertEquals(point.toString(), "Point [1.0, 2.0, 3.0]");
    }
}