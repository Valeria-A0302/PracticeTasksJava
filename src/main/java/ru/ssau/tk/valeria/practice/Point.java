package ru.ssau.tk.valeria.practice;

public class Point {
    public double x;
    public double y;
    public double z;

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
