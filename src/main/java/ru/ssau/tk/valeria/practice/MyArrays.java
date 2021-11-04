package ru.ssau.tk.valeria.practice;

import java.util.ArrayList;
import java.util.*;

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
            firstMember += difference;
        }
        return array;
    }

    public static int[] geometricProgression(int firstMember, int denominator, int numberOfMembers) {
        int[] array = new int[numberOfMembers];
        array[0] = firstMember;
        for (int element = 1; element < numberOfMembers; element++) {
            array[element] = firstMember * denominator;
            firstMember *= denominator;
        }
        return array;
    }

    public static ArrayList<Integer> divisorOfNumber(int number) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int element = 1; element <= Math.sqrt(Math.abs(number)); element++) {
            if (number % element == 0) {
                array.add(element);
            }
        }
        return array;
    }

    public static boolean isItSimple(Integer number) {
        for (int divider = number - 1; divider > 1; divider--) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> primeNumbers(int number) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int primeNumber = number; primeNumber > 1; primeNumber--) {
            if (isItSimple(primeNumber)) {
                array.add(primeNumber);
            }
        }
        Collections.reverse(array);
        return array;
    }

    public static int[] symmetry(int length) {
        int[] array = new int[length];
        for (int element = 0; element <= length / 2; element++) {
            array[element] = element + 1;
            array[length - 1 - element] = element + 1;
        }
        return array;
    }

    public static void oppositeSign(double[] array) {
        for (int element = 0; element < array.length; element++) {
            array[element] = -array[element];
        }
    }

    public static boolean checkingArray(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean arrayInteger(Integer[] array) {
        for (Integer i : array) {
            if (i == null) {
                return true;
            }
        }
        return false;
    }

    public static int evenNumbers(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static Number maximum(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        int maximum = array[0];
        for (Integer integer : array) {
            if (integer > maximum) {
                maximum = integer;
            }
        }
        return maximum;
    }

    public static int sunOfIndexes(int[] array) {
        int sum = 0;
        for (int element = 0; element < array.length; element++) {
            if (element % 2 == 0) {
                sum += array[element];
            }
        }
        return sum;
    }

    public static boolean divisionIntoFirstAndLastElement(int[] array) {
        int first = 0;
        int last = 0;
        for (int i : array) {
            if (i % array[0] == 0) {
                first++;
            }
            if (i % array[array.length - 1] == 0) {
                last++;
            }
        }
        return first > last;
    }

    public static int mostCommonNumber(int[] array) {
        int countMax = 0;
        int count = 0;
        int indexMax = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = i; k < array.length; k++) {
                if (array[i] == array[k]) {
                    count++;
                }
            }
            if (count > countMax) {
                countMax = count;
                indexMax = index;
            }
            index++;
            count = 0;
        }
        return array[indexMax];
    }

    public static int index(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void change(int[] array) {
        int max = array[0];
        int indexMax = 0;
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        int change = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = change;
    }

    public static void bitwiseNegation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public static int[] bitwiseNegationTwo(int[] array) {
        int[] arrayTwo = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayTwo[i] = ~array[i];
        }
        return arrayTwo;
    }

    public static int[] sumOfArrayIndexes(int[] array) {
        int[] arrayTwo;
        if (array.length % 2 != 0) {
            arrayTwo = new int[array.length / 2 + 1];
            for (int i = 0; i < arrayTwo.length - 1; i++) {
                arrayTwo[i] = array[i * 2] + array[i * 2 + 1];
            }
            arrayTwo[arrayTwo.length - 1] = array[array.length - 1];
        } else {
            arrayTwo = new int[array.length / 2];
            for (int i = 0; i < arrayTwo.length; i++) {
                arrayTwo[i] = array[i * 2] + array[i * 2 + 1];
            }
        }
        return arrayTwo;
    }

    public static boolean[] booleanArray(int[] array) {
        boolean[] newArray = new boolean[array.length];
        for (int element = 0; element < array.length; element++) {
            newArray[element] = array[element] % 2 == 0;
        }
        return newArray;
    }

    public static int[] numberOfTwoBitNumbers(long number) {
        return new int[]{(int) (number >>> 32), (int) number};
    }

    public static long twoNumbersIntoOne(int[] twoNumbers) {
        return ((long) twoNumbers[0] << 32) | twoNumbers[1];
    }

    public static int[] strangeArray(int length, int index) {
        int[] array = new int[length];
        for (int element = 0; element < array.length; element++) {
            array[element] = index;
            if (index > length) {
                array[element] = index - length;
            }
            index++;
        }
        return array;
    }

    public static int[][] dynamicArray(int dimension) {
        int[][] array = new int[dimension][];
        int number = 1;
        for (int element = 0; element < dimension; element++) {
            array[element] = new int[dimension - element];
            for (int index = 0; index < (dimension - element); index++) {
                array[element][index] = number;
                number++;
            }
        }
        return array;
    }

    public static void sortedArray(double[] array) {
        for (double v : array) {
            if (Double.isNaN(v)) {
                return;
            }
        }
        Arrays.sort(array);
    }

    public static void printArray(String[] array) {
        for (String i : array) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = new String[]{"Привет! ", "Это ", "массив ", "строк"};
        printArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static double multiplicationOfArrayElements(double[] array) {
        double multiplication = 1.0;
        for (double i : array) {
            if (!Double.isNaN(i) && i != Double.POSITIVE_INFINITY && i != Double.NEGATIVE_INFINITY) {
                multiplication *= i;
            }
        }
        return multiplication;
    }
}
