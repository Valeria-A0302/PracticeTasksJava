package ru.ssau.tk.valeria.practice;

public class Testing {
    public static void main(String[] args) {
        System.out.println("Сложение: "+Points.sum (23.5,1.5));
        System.out.println("Вычитание: "+Points.subtract(23.6,2.6));
        System.out.println("Умножение: "+Points.multiply(12.0,4.0));
        System.out.println("Деление: "+Points.divide(49.0, 7.0));

        Points point = new Points(3, 5, 7);
        System.out.println(Points.enlarge(point,3).getX());
        System.out.println(Points.enlarge(point,2).getY());
        System.out.println(Points.enlarge(point,7).getZ());
    }
}
