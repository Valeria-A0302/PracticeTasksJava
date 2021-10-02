package ru.ssau.tk.valeria.practice;

public class Points {
    public double x;
    public double y;
    public double z;
    public static final double DELTA = 0.00001;

    public static double length(Point point) {
        return point.length();
    }

    public static double scalarProduct(Points pointOne, Points pointTwo) {
        return (pointOne.getX() * pointTwo.getX() + pointOne.getY() * pointTwo.getY() + pointOne.getZ() * pointTwo.getZ());
    }

    public static Points vectorProduct(Points pointOne, Points pointTwo) {
        return new Points(pointOne.getY() * pointTwo.getZ() - pointOne.getZ() * pointTwo.getY(), pointOne.getZ() * pointTwo.getX() - pointOne.getX() * pointTwo.getZ(), pointOne.getX() * pointTwo.getY() - pointOne.getY() * pointTwo.getX());
    }

    public Points(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public static Points enlarge(Points point, double someNumber) {
        return new Points(point.getX() * someNumber, point.getY() * someNumber, point.getZ() * someNumber);
    }

    public static Points opposite(Points point) {
        return new Points(point.getX() * (-1), point.getY() * (-1), point.getZ() * (-1));
    }

    public static Points inverse(Points point) {
        return new Points(1 / point.getX(), 1 / point.getY(), 1 / point.getZ());
    }

    public static Points sum(Points pointOne, Points pointTwo) {
        return new Points(pointOne.getX() + pointTwo.getX(), pointOne.getY() + pointTwo.getY(), pointOne.getZ() + pointTwo.getZ());
    }

    public static Points subtract(Points pointOne, Points pointTwo) {
        return new Points(pointOne.getX() - pointTwo.getX(), pointOne.getY() - pointTwo.getY(), pointOne.getZ() - pointTwo.getZ());
    }

    public static Points multiply(Points pointOne, Points pointTwo) {
        return new Points(pointOne.getX() * pointTwo.getX(), pointOne.getY() * pointTwo.getY(), pointOne.getZ() * pointTwo.getZ());
    }

    public static Points divide(Points pointOne, Points pointTwo) {
        return new Points(pointOne.getX() / pointTwo.getX(), pointOne.getY() / pointTwo.getY(), pointOne.getZ() / pointTwo.getZ());
    }

}
