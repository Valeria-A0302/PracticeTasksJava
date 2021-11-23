package ru.ssau.tk.valeria.practice.transportation;

import org.testng.annotations.Test;

import static ru.ssau.tk.valeria.practice.transportation.WaypointType.*;

public class WaypointTest {
    @Test
    public static void testToString() {
        Waypoint villageOne = new Waypoint();
        villageOne.setType(DEPOT);
        villageOne.setName("Мнио");
        villageOne.setId(345);
        villageOne.setLatitude(123.45);
        villageOne.setLongitude(789.65);

        Waypoint villageTwo = new Waypoint();
        villageTwo.setType(WAREHOUSE);
        villageTwo.setName("Мнио");
        villageTwo.setId(345);
        villageTwo.setLatitude(123.45);
        villageTwo.setLongitude(789.65);

        System.out.println(villageOne);
        System.out.println(villageTwo);
    }
}