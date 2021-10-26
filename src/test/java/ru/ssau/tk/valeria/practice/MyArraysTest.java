package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.valeria.practice.MyArrays.*;

public class MyArraysTest {
    public static final double DELTA = 0.0001;

    @Test
    public static void testSize() {
        Assert.assertEquals(size(13).length, 13);
        Assert.assertEquals(size(1).length, 1);
        Assert.assertEquals(size(0).length, 0);
    }

    @Test
    public static void testGenerator() {
        Assert.assertEquals(generator(4)[0], 2);
        Assert.assertEquals(generator(4)[1], 1);
        Assert.assertEquals(generator(4)[2], 1);
        Assert.assertEquals(generator(4)[3], 2);
    }

    @Test
    public static void testOddArray() {
        Assert.assertEquals(oddArray(7)[0], 1);
        Assert.assertEquals(oddArray(7)[1], 3);
        Assert.assertEquals(oddArray(7)[2], 5);
        Assert.assertEquals(oddArray(7)[3], 7);
        Assert.assertEquals(oddArray(7)[4], 9);
        Assert.assertEquals(oddArray(7)[5], 11);
        Assert.assertEquals(oddArray(7)[6], 13);
    }

    @Test
    public static void testEvenArray() {
        Assert.assertEquals(evenArray(7)[0], 2);
        Assert.assertEquals(evenArray(7)[1], 4);
        Assert.assertEquals(evenArray(7)[2], 6);
        Assert.assertEquals(evenArray(7)[3], 8);
        Assert.assertEquals(evenArray(7)[4], 10);
        Assert.assertEquals(evenArray(7)[5], 12);
        Assert.assertEquals(evenArray(7)[6], 14);
    }

    @Test
    public static void testFibonacciNumbers() {
        Assert.assertEquals(fibonacciNumbers(8)[0], 0);
        Assert.assertEquals(fibonacciNumbers(8)[1], 1);
        Assert.assertEquals(fibonacciNumbers(8)[2], 1);
        Assert.assertEquals(fibonacciNumbers(8)[3], 2);
        Assert.assertEquals(fibonacciNumbers(8)[4], 3);
        Assert.assertEquals(fibonacciNumbers(8)[5], 5);
        Assert.assertEquals(fibonacciNumbers(8)[6], 8);
        Assert.assertEquals(fibonacciNumbers(8)[7], 13);
    }

    @Test
    public static void testSquareOfNumbers() {
        Assert.assertEquals(squareOfNumbers(10)[0], 0);
        Assert.assertEquals(squareOfNumbers(10)[1], 1);
        Assert.assertEquals(squareOfNumbers(10)[2], 4);
        Assert.assertEquals(squareOfNumbers(10)[3], 9);
        Assert.assertEquals(squareOfNumbers(10)[4], 16);
        Assert.assertEquals(squareOfNumbers(10)[5], 25);
        Assert.assertEquals(squareOfNumbers(10)[6], 36);
        Assert.assertEquals(squareOfNumbers(10)[7], 49);
        Assert.assertEquals(squareOfNumbers(10)[8], 64);
        Assert.assertEquals(squareOfNumbers(10)[9], 81);
    }

    @Test
    public static void testQuadraticEquation() {
        Assert.assertEquals(quadraticEquation(2, 3, 4), new double[0]);
        Assert.assertEquals(quadraticEquation(0, 3, 4)[0], -1.3333, DELTA);
        Assert.assertEquals(quadraticEquation(2, 8, 2)[0], -0.2679, DELTA);
        Assert.assertEquals(quadraticEquation(2, 8, 2)[1], -3.7320, DELTA);
        Assert.assertEquals(quadraticEquation(0, 0, 0)[0], Double.NaN);
    }

    @Test
    public static void testArrayWithoutTriples() {
        Assert.assertEquals(arrayWithoutTriples(7)[0], 1);
        Assert.assertEquals(arrayWithoutTriples(7)[1], 2);
        Assert.assertEquals(arrayWithoutTriples(7)[2], 4);
        Assert.assertEquals(arrayWithoutTriples(7)[3], 5);
        Assert.assertEquals(arrayWithoutTriples(7)[4], 7);
        Assert.assertEquals(arrayWithoutTriples(7)[5], 8);
        Assert.assertEquals(arrayWithoutTriples(7)[6], 10);
    }

    @Test
    public static void testArithmeticProgression() {
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[0], 1);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[1], 4);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[2], 7);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[3], 10);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[4], 13);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[5], 16);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[6], 19);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[7], 22);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[8], 25);
        Assert.assertEquals(arithmeticProgression(1, 3, 10)[9], 28);
    }

    @Test
    public static void testGeometricProgression() {
        Assert.assertEquals(geometricProgression(1, 4, 5)[0], 1);
        Assert.assertEquals(geometricProgression(1, 4, 5)[1], 4);
        Assert.assertEquals(geometricProgression(1, 4, 5)[2], 16);
        Assert.assertEquals(geometricProgression(1, 4, 5)[3], 64);
        Assert.assertEquals(geometricProgression(1, 4, 5)[4], 256);
    }

    @Test
    public static void testDivisorOfNumber() {
        Assert.assertEquals(divisorOfNumber(36).get(0), Integer.valueOf(1));
        Assert.assertEquals(divisorOfNumber(36).get(1), Integer.valueOf(2));
        Assert.assertEquals(divisorOfNumber(36).get(2), Integer.valueOf(3));
        Assert.assertEquals(divisorOfNumber(36).get(3), Integer.valueOf(4));
        Assert.assertEquals(divisorOfNumber(36).get(4), Integer.valueOf(6));
    }

    @Test
    public static void testIsItSimple() {
        Assert.assertTrue(isItSimple(11));
        Assert.assertFalse(isItSimple(4));
        Assert.assertTrue(isItSimple(13));
        Assert.assertTrue(isItSimple(17));
        Assert.assertFalse(isItSimple(12));
        Assert.assertFalse(isItSimple(9));
    }

    @Test
    public static void testPrimeNumbers() {
        Assert.assertEquals(primeNumbers(18).get(0), Integer.valueOf(2));
        Assert.assertEquals(primeNumbers(18).get(1), Integer.valueOf(3));
        Assert.assertEquals(primeNumbers(18).get(2), Integer.valueOf(5));
        Assert.assertEquals(primeNumbers(18).get(3), Integer.valueOf(7));
        Assert.assertEquals(primeNumbers(18).get(4), Integer.valueOf(11));
    }

    @Test
    public static void testSymmetry() {
        Assert.assertEquals(symmetry(7)[0], 1);
        Assert.assertEquals(symmetry(7)[1], 2);
        Assert.assertEquals(symmetry(7)[2], 3);
        Assert.assertEquals(symmetry(7)[3], 4);
        Assert.assertEquals(symmetry(7)[4], 3);
        Assert.assertEquals(symmetry(7)[5], 2);
        Assert.assertEquals(symmetry(7)[6], 1);

        Assert.assertEquals(symmetry(5)[0], 1);
        Assert.assertEquals(symmetry(5)[1], 2);
        Assert.assertEquals(symmetry(5)[2], 3);
        Assert.assertEquals(symmetry(5)[3], 2);
        Assert.assertEquals(symmetry(5)[4], 1);
    }

    @Test
    public static void testOppositeSign() {
        double[] array = new double[]{1.7, -3, 4, -21.3, 2};
        oppositeSign(array);
        Assert.assertEquals(array, new double[]{-1.7, 3, -4, 21.3, -2});
    }

    @Test
    public static void testCheckingArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        Assert.assertTrue(checkingArray(array, 5));
        Assert.assertFalse(checkingArray(array, 10));
    }

    @Test
    public static void testArrayInteger() {
        Integer[] array = new Integer[]{1, 3, 4, 6, 8, 26, 256};
        Assert.assertFalse(arrayInteger(array));
        Integer[] arrayTwo = new Integer[]{1, 545, 3453, null, 342};
        Assert.assertTrue(arrayInteger(arrayTwo));
    }

    @Test
    public static void testEvenNumbers() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
        Assert.assertEquals(evenNumbers(array), 6);
        int[] arrayTwo = new int[]{24, 2, 16, 4, 5, 6, 7, 11, 33};
        Assert.assertEquals(evenNumbers(arrayTwo), 5);
        int[] arrayThree = new int[]{0, 2, 100, 4, 5, 13, 7, 31, 17, 11};
        Assert.assertEquals(evenNumbers(arrayThree), 4);
    }

    @Test
    public static void testMaximum() {
        Integer[] array = new Integer[]{1, 2, 5, 6, 3, 4, 0};
        Assert.assertEquals(maximum(array), 6);
        Integer[] arrayTwo = new Integer[]{};
        Assert.assertNull(maximum(arrayTwo));
        Integer[] arrayThree = new Integer[]{0, 5, 7, 3, 10};
        Assert.assertEquals(maximum(arrayThree), 10);
        Integer[] arrayFour = new Integer[]{50, 15, 2, 3, 11};
        Assert.assertEquals(maximum(arrayFour), 50);
    }

    @Test
    public static void testSunOfIndexes() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertEquals(sunOfIndexes(array), 16);
        int[] arrayTwo = new int[]{24, 2, 16, 4, 5, 6, 7, 11, 33};
        Assert.assertEquals(sunOfIndexes(arrayTwo), 85);
    }

    @Test
    public static void testDivisionIntoFirstAndLastElement() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertTrue(divisionIntoFirstAndLastElement(array));
        int[] arrayTwo = new int[]{7, 6, 5, 4, 3, 2, 1};
        Assert.assertFalse(divisionIntoFirstAndLastElement(arrayTwo));
    }

    @Test
    public static void testMostCommonNumber() {
        int[] array = new int[]{1, 2, 1, 4, 5, 2, 6, 2, 2, 3, 4, 7};
        Assert.assertEquals(mostCommonNumber(array), 2);
        int[] arrayTwo = new int[]{1, 1, 1, 2, 2, 2};
        Assert.assertEquals(mostCommonNumber(arrayTwo), 1);
    }

    @Test
    public static void testIndex() {
        int[] array = new int[]{10, 9, 8, 7, 6, 5, 4};
        Assert.assertEquals(index(array, 7), 3);
    }

    @Test
    public static void testChange() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        change(array);
        Assert.assertEquals(array[0], 10);
        Assert.assertEquals(array[9], 1);
    }

    @Test
    public static void testBitwiseNegation() {
        int[] array = new int[]{10, 2, 3, 4, 5};
        bitwiseNegation(array);
        Assert.assertEquals(array[0], -11);
        Assert.assertEquals(array[1], -3);
        Assert.assertEquals(array[2], -4);
        Assert.assertEquals(array[3], -5);
        Assert.assertEquals(array[4], -6);

        bitwiseNegation(array);
        Assert.assertEquals(array[0], 10);
        Assert.assertEquals(array[1], 2);
        Assert.assertEquals(array[2], 3);
        Assert.assertEquals(array[3], 4);
        Assert.assertEquals(array[4], 5);
    }

    @Test
    public static void testBitwiseNegationTwo() {
        int[] array = new int[]{2, 3, 6, 8, 9, 10};
        Assert.assertEquals(bitwiseNegationTwo(array)[0], -3);
        Assert.assertEquals(bitwiseNegationTwo(array)[1], -4);
        Assert.assertEquals(bitwiseNegationTwo(array)[2], -7);
        Assert.assertEquals(bitwiseNegationTwo(array)[3], -9);
        Assert.assertEquals(bitwiseNegationTwo(array)[4], -10);
        Assert.assertEquals(bitwiseNegationTwo(array)[5], -11);

        Assert.assertEquals(bitwiseNegationTwo(bitwiseNegationTwo(array))[0], 2);
        Assert.assertEquals(bitwiseNegationTwo(bitwiseNegationTwo(array))[1], 3);
        Assert.assertEquals(bitwiseNegationTwo(bitwiseNegationTwo(array))[2], 6);
        Assert.assertEquals(bitwiseNegationTwo(bitwiseNegationTwo(array))[3], 8);
        Assert.assertEquals(bitwiseNegationTwo(bitwiseNegationTwo(array))[4], 9);
        Assert.assertEquals(bitwiseNegationTwo(bitwiseNegationTwo(array))[5], 10);
    }

    @Test
    public static void testSumOfArrayIndexes() {
        int[] array = new int[]{12, 2, 14, 5, 16, 4};
        Assert.assertEquals(sumOfArrayIndexes(array)[0], 14);
        Assert.assertEquals(sumOfArrayIndexes(array)[1], 19);
        Assert.assertEquals(sumOfArrayIndexes(array)[2], 20);

        int[] newArray = new int[]{1, 23, 2, 3, 6};
        Assert.assertEquals(sumOfArrayIndexes(newArray)[0], 24);
        Assert.assertEquals(sumOfArrayIndexes(newArray)[1], 5);
        Assert.assertEquals(sumOfArrayIndexes(newArray)[2], 6);

    }
}