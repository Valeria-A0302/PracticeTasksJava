package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.valeria.practice.Points.*;

public class PointsTest {

    private static boolean equalsApproximately(double numberOne, double numberTwo) {
        return Math.abs(numberOne - numberTwo) < DELTA;
    }

    public static boolean equalsApproximately(Point pointOne, Point pointTwo) {
        return equalsApproximately(pointOne.getX(), pointTwo.getX()) && equalsApproximately(pointOne.getY(), pointTwo.getY()) && equalsApproximately(pointOne.getZ(), pointTwo.getZ());
    }

    @Test
    public static void testScalarProduct() {
        Assert.assertFalse(equalsApproximately(scalarProduct(new Points(2.01, 3.03, 4.01), new Points(9.03, 6.01, 4.02)), 1));
    }

    @Test
    public static void testingSettersAndGetters() {
        Points point = new Points(1.5, 2.5, 3.5);
        point.setX(1.5);
        point.setY(2.5);
        point.setZ(3.5);
        Assert.assertEquals(point.getX(), 1.5);
        Assert.assertEquals(point.getY(), 2.5);
        Assert.assertEquals(point.getZ(), 3.5);
    }

    @Test
    public static void testSum() {
        Points pointOne = new Points(4.5, 5.5, 6.5);
        Points pointTwo = new Points(7.5, 8.5, 9.5);
        Points pointThree = sum(pointOne, pointTwo);
        Assert.assertEquals(pointThree.getX(), 12.0, DELTA);
        Assert.assertEquals(pointThree.getY(), 14.0, DELTA);
        Assert.assertEquals(pointThree.getZ(), 16.0, DELTA);
    }

    @Test
    public static void testSubtract() {
        Points pointOne = new Points(4.5, 5.5, 6.5);
        Points pointTwo = new Points(7.5, 8.5, 9.5);
        Points pointThree = subtract(pointOne, pointTwo);
        Assert.assertEquals(pointThree.getX(), -3, DELTA);
        Assert.assertEquals(pointThree.getY(), -3, DELTA);
        Assert.assertEquals(pointThree.getZ(), -3, DELTA);
    }

    @Test
    public static void testMultiply() {
        Points pointOne = new Points(4.5, 5.5, 6.5);
        Points pointTwo = new Points(7.5, 8.5, 9.5);
        Points pointThree = multiply(pointOne, pointTwo);
        Assert.assertEquals(pointThree.getX(), 33.75, DELTA);
        Assert.assertEquals(pointThree.getY(), 46.75, DELTA);
        Assert.assertEquals(pointThree.getZ(), 61.75, DELTA);
    }

    @Test
    public static void testDivide() {
        Points pointOne = new Points(4.5, 5.5, 6.5);
        Points pointTwo = new Points(7.5, 8.5, 9.5);
        Points pointThree = divide(pointOne, pointTwo);
        Assert.assertEquals(pointThree.getX(), 0.6, DELTA);
        Assert.assertEquals(pointThree.getY(), 0.64705, DELTA);
        Assert.assertEquals(pointThree.getZ(), 0.68421, DELTA);
    }
}