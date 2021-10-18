package ru.ssau.tk.valeria.practice;

public class MyArrays {
    public static int[] size(int length) {
        return new int[length];
    }

    public static int[] generator(int length) {
        int[] array = new int[length];
        array[0] = 2;
        array[length - 1] = 2;
        for (int i = 1; i < length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }

    public static int[] oddArray(int length) {
        int[] array = new int[length];
        for (int element = 0; element < length; element++) {
            array[element] = 2 * element + 1;
        }
        return array;
    }

    public static int[] evenArray(int length) {
        int[] array = new int[length];
        for (int element = length - 1; element >= 0; element--) {
            array[element] = 2 * element + 2;
        }
        return array;
    }

    public static int[] fibonacciNumbers(int length) {
        int[] array = new int[length];
        array[0] = 0;
        array[1] = 1;
        for (int element = 2; element < length; element++) {
            array[element] = array[element - 1] + array[element - 2];
        }
        return array;
    }

    public static int[] squareOfNumbers(int length) {
        int[] array = new int[length];
        for (int element = 0; element < length; element++) {
            array[element] = element * element;
        }
        return array;
    }

    public static double[] twoSolutions(double x1, double x2) {
        if (x1 > x2) {
            return new double[]{x1, x2};
        }
        return new double[]{x2, x1};
    }

    public static double[] oneSolution(double x) {
        double[] array = new double[1];
        array[0] = x;
        return array;
    }

    public static double[] noSolutionsAtAll() {
        return new double[0];
    }

    public static double[] quadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double sqrt = Math.sqrt(discriminant);
        if (a == 0) {
            double x = -c / b;
            return oneSolution(x);
        }
        if (discriminant < 0) {
            return noSolutionsAtAll();
        }
        if (discriminant == 0) {
            double x = (-b) / (2 * a);
            return oneSolution(x);
        }
        double x1 = ((-b) + sqrt) / (2 * a);
        double x2 = ((-b) - sqrt) / (2 * a);
        return twoSolutions(x1, x2);
    }

    public static int[] arrayWithoutTriples(int length) {
        int[] array = new int[length];
        int number = 1;
        for (int element = 0; element < length; element++, number++) {
            if (number % 3 == 0) {
                array[element] = number + 1;
                number++;
            } else {
                array[element] = number;
            }
        }
        return array;
    }

    public static int[] arithmeticProgression(int firstMember, int difference, int numberOfMembers) {
        int[] array = new int[numberOfMembers];
        array[0] = firstMember;
        for (int element = 1; element < numberOfMembers; element++) {
            array[element] = firstMember + difference;
            firstMember+=difference;
        }
        return array;
    }
}
