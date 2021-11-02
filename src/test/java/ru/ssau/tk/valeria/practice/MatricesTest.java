package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatricesTest {
    @Test
    public static void testSumOfMatrix() {
        Matrix matrixOne = new Matrix(3, 2);
        matrixOne.setAt(0, 0, 2);
        matrixOne.setAt(0, 1, 3);
        matrixOne.setAt(1, 0, 4);
        matrixOne.setAt(1, 1, 1);
        matrixOne.setAt(2, 0, 5);
        matrixOne.setAt(2, 1, 7);

        Matrix matrixTwo = new Matrix(3, 2);
        matrixTwo.setAt(0, 0, 2);
        matrixTwo.setAt(0, 1, 3);
        matrixTwo.setAt(1, 0, 3);
        matrixTwo.setAt(1, 1, 1);
        matrixTwo.setAt(2, 0, 4);
        matrixTwo.setAt(2, 1, 7);

        Matrix sum = Matrices.sumOfMatrices(matrixOne, matrixTwo);
        assert sum != null;
        Assert.assertEquals(sum.getAt(0, 0), 4.0);
        Assert.assertEquals(sum.getAt(0, 1), 6.0);
        Assert.assertEquals(sum.getAt(1, 0), 7.0);
        Assert.assertEquals(sum.getAt(1, 1), 2.0);
        Assert.assertEquals(sum.getAt(2, 0), 9.0);
        Assert.assertEquals(sum.getAt(2, 1), 14.0);
    }

}