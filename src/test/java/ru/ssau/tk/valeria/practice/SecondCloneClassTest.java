package ru.ssau.tk.valeria.practice;

import org.testng.annotations.Test;

public class SecondCloneClassTest {

    @Test
    public static void testClone() {
        SecondCloneClass objectOne = new SecondCloneClass();
        objectOne.clone();
    }
}