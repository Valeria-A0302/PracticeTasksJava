package ru.ssau.tk.valeria.practice;

public class SecondCloneClass implements Cloneable {
    @Override
    public SecondCloneClass clone() {
        try {
            return (SecondCloneClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
