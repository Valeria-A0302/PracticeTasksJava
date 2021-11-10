package ru.ssau.tk.valeria.practice;

import org.testng.annotations.Test;

public class MatrixTest {
    @Test
    public static void testToString() {
        Matrix matrix = new Matrix(3, 2);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(1, 0, 3);
        matrix.setAt(1, 1, 4);
        matrix.setAt(2, 0, 5);
        matrix.setAt(2, 1, 6);
        System.out.println(matrix);
    }
}