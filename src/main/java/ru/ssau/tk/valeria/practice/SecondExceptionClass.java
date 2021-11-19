package ru.ssau.tk.valeria.practice;

public class SecondExceptionClass extends RuntimeException {
    public SecondExceptionClass(Exception exception) {
        super(exception);
    }

    public SecondExceptionClass() {
        super();
    }

    public SecondExceptionClass(String string) {
        super(string);
    }
}
