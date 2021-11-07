package ru.ssau.tk.valeria.practice;

import org.testng.annotations.Test;

public class MyLinesTest {
    @Test
    public static void testStringCharacter() {
        String string = "This is string";
        MyLines.stringCharacter(string);
    }

}