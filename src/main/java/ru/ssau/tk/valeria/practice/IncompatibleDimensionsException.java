package ru.ssau.tk.valeria.practice;

public class IncompatibleDimensionsException extends RuntimeException {
    public IncompatibleDimensionsException() {
        this("Размеры матриц несовместимы!");
    }

    public IncompatibleDimensionsException(String string) {
        super(string);
    }
}
