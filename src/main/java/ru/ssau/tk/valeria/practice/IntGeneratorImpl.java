package ru.ssau.tk.valeria.practice;

public class IntGeneratorImpl implements IntGenerator {
    public static int object = 0;

    @Override
    public int nextInt() {
        return object++;
    }
}
