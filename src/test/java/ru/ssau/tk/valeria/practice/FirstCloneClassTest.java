package ru.ssau.tk.valeria.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstCloneClassTest {
    @Test
    public void testClone() {
        FirstCloneClass objectOne = new FirstCloneClass();
        Assert.assertThrows(CloneNotSupportedException.class, () -> System.out.println(objectOne.clone()));
    }
}