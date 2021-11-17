package ru.ssau.tk.valeria.practice;

public class FirstCloneClass {
    @Override
    public FirstCloneClass clone() throws CloneNotSupportedException {
        return (FirstCloneClass) super.clone();
    }
}
