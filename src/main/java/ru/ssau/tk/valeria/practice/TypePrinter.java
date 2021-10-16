package ru.ssau.tk.valeria.practice;

import java.util.Objects;

public class TypePrinter {
    public static void printType(byte number) {
        System.out.println("Byte " + number);
    }

    public static void printType(char number) {
        System.out.println("Char " + number);
    }

    public static void printType(short number) {
        System.out.println("Short " + number);
    }

    public static void printType(int number) {
        System.out.println("Int " + number);
    }

    public static void printType(long number) {
        System.out.println("Long " + number);
    }

    public static void printType(float number) {
        System.out.println("Float " + number);
    }

    public static void printType(double number) {
        System.out.println("Double " + number);
    }

    public static void printType(boolean number) {
        System.out.println("Boolean " + number);
    }

    public static void printType(Object number) {
        if (number == null) {
            System.out.println("Null");
        } else {
            System.out.println(Objects.requireNonNull(number).getClass());
        }
    }

    public static void main(String[] args) {
        byte number = 0;
        printType(number);
        printType((char) number);
        printType((short) number);
        printType((int) number);
        printType((long) number);
        printType((float) number);
        printType((double) number);
        printType(true);
        printType(new Person());
        printType(null);
    }
}
