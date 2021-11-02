package ru.ssau.tk.valeria.practice;

public class Matrices {
    public static Matrix sumOfMatrices(Matrix matrixOne, Matrix matrixTwo) {
        if (matrixOne.getColumns() != matrixTwo.getColumns() || matrixOne.getLines() != matrixTwo.getLines()) {
            return null;
        }
        Matrix sum = new Matrix(matrixOne.getColumns(), matrixTwo.getLines());
        for (int column = 0; column < sum.getColumns(); column++) {
            for (int line = 0; line < sum.getLines(); line++) {
                double sumElements = matrixOne.getAt(column, line) + matrixTwo.getAt(column, line);
                sum.setAt(column, line, sumElements);
            }
        }
        return sum;
    }
}
