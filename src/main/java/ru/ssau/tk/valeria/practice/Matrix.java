package ru.ssau.tk.valeria.practice;

public class Matrix {
    private final double[][] matrix;
    private final int columns;
    private final int lines;

    public Matrix(int columns, int lines) {
        this.columns = columns;
        this.lines = lines;
        matrix = new double[columns][lines];
    }

    public void setAt(int columns, int lines, double number) {
        matrix[columns][lines] = number;
    }

    public double getAt(int columns, int lines) {
        return matrix[columns][lines];
    }

    public int getColumns() {
        return columns;
    }

    public int getLines() {
        return lines;
    }
}
