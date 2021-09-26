package ru.ssau.tk.valeria.practice;

public class Testing {
    public static void main(String[] args) {

        Points pointOne = new Points(3, 5, 7);
        Points pointTwo = new Points(4, 6,8);
        System.out.println("Скалярное произведение: ");
        System.out.println(pointOne.getX()*pointTwo.getX() + pointOne.getY()*pointTwo.getY() + pointOne.getZ()*pointTwo.getZ());

        System.out.println();

        System.out.println("Векторное произведение: ");
        System.out.println(Points.vectorProduct(pointOne, pointTwo).getX());
        System.out.println(Points.vectorProduct(pointOne, pointTwo).getY());
        System.out.println(Points.vectorProduct(pointOne, pointTwo).getZ());

    }
}
