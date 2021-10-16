package ru.ssau.tk.valeria.practice;

public class Wrapper {
    public static void main(String[] args) {
        Integer numberOne = 1;
        int a = numberOne;

        Double numberTwo = 5.5;
        double b = numberTwo;

        Character numberTree = 127;
        char c = numberTree;

        double division = numberOne / numberTwo;
        Double multiplication = a * b;

        if (multiplication == b) {
            System.out.println("Multiplication and b are equal");
        } else {
            System.out.println("Oops, multiplication and b aren't equal");
        }
        multiplication = null;
        System.out.println(multiplication);

        Boolean condition = false;
        if (condition){
            System.out.println(condition);
        }
        condition = true;
        if (condition){
            System.out.println(condition);
        }
        condition = false;
        if (Boolean.TRUE.equals(condition)){
            System.out.println(condition);
        }
        condition = true;
        if (Boolean.TRUE.equals(condition)){
            System.out.println(condition);
        }
    }
}
