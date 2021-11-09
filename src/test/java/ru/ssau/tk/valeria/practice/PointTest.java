package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public static void testingGetters() {
        Points point = new Points(1.5, 2.5, 3.5);
        Assert.assertEquals(point.getX(), 1.5);
        Assert.assertEquals(point.getY(), 2.5);
        Assert.assertEquals(point.getZ(), 3.5);
    }

    @Test
    public static void testToString() {
        Point point = new Point(1.5, 2.5, 3.5);
        Assert.assertEquals(point.toString(), "[1.5, 2.5, 3.5]");
    }
}