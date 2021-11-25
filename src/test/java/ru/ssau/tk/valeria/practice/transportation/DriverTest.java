package ru.ssau.tk.valeria.practice.transportation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

import static ru.ssau.tk.valeria.practice.Gender.*;

public class DriverTest {
    @Test
    public static void testEqualsAndToString() {
        Driver driverOne = new Driver();
        driverOne.setId(1234);
        driverOne.setName("Иван");
        driverOne.setGender(MALE);
        driverOne.setLicenseExpirationDate(new Date(87436015L));

        Driver driverTwo = new Driver();
        driverTwo.setId(4566);
        driverTwo.setName("Александр");
        driverTwo.setGender(MALE);
        driverTwo.setLicenseExpirationDate(new Date(185915691L));

        Driver driverThree = new Driver();
        driverThree.setId(1234);
        driverThree.setName("Иван");
        driverThree.setGender(MALE);
        driverThree.setLicenseExpirationDate(new Date(87436015L));

        Assert.assertNotEquals(driverOne, driverTwo);
        Assert.assertEquals(driverOne, driverThree);

        System.out.println(driverOne);
    }
}