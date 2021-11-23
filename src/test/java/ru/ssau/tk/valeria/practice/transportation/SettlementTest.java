package ru.ssau.tk.valeria.practice.transportation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.valeria.practice.transportation.SettlementType.*;

public class SettlementTest {
    @Test
    public static void testToString() {
        Settlement city = new Settlement();
        city.setType(CITY);
        city.setName("Пувуа");
        city.setId(123);
        city.setLatitude(234.55);
        city.setLongitude(345.75);

        Settlement villageTwo = new Settlement();
        villageTwo.setType(VILLAGE);
        villageTwo.setName("Бебуа");
        villageTwo.setId(567);
        villageTwo.setLatitude(275.89);
        villageTwo.setLongitude(195.38);

        System.out.println(city);
        System.out.println(villageTwo);
    }
}