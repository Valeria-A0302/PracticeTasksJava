package ru.ssau.tk.valeria.practice.transportation;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.valeria.practice.Gender;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

import static ru.ssau.tk.valeria.practice.transportation.SettlementType.*;
import static ru.ssau.tk.valeria.practice.transportation.WaypointType.*;

public class CompanyModelTest {
    @Test
    public static void testAllLocations() {
        Collection<Location> allLocations = new LinkedHashSet<>();
        Location locationOne = new Location();
        Location locationTwo = new Location();
        Location locationThree = new Location();

        locationOne.setId(1);
        locationTwo.setId(2);
        locationThree.setId(2);

        locationOne.setName("Samara");
        locationTwo.setName("Moscow");
        locationThree.setName("Moscow");

        locationOne.setLongitude(23.23);
        locationTwo.setLongitude(34.54);
        locationThree.setLongitude(34.54);

        locationOne.setLatitude(54.75);
        locationTwo.setLatitude(123.43);
        locationThree.setLatitude(123.43);

        allLocations.add(locationOne);
        allLocations.add(locationTwo);
        allLocations.add(locationThree);

        Assert.assertEquals(allLocations.size(), 2);
    }

    @Test
    public static void testAllRoutes() {
        Collection<Route> allRoutes = new LinkedHashSet<>();
        Route routeOne = new Route();
        Route routeTwo = new Route();

        Settlement cityOne = new Settlement();
        cityOne.setType(CITY);
        cityOne.setName("Пувуа");
        cityOne.setId(123);
        cityOne.setLatitude(234.55);
        cityOne.setLongitude(345.75);

        Waypoint villageOne = new Waypoint();
        villageOne.setType(EMPTY);
        villageOne.setName("Мнио");
        villageOne.setId(345);
        villageOne.setLatitude(123.45);
        villageOne.setLongitude(789.65);

        routeOne.addNewLocation(cityOne);
        routeOne.addNewLocation(villageOne);

        routeTwo.addNewLocation(cityOne);
        routeTwo.addNewLocation(villageOne);


        allRoutes.add(routeOne);
        allRoutes.add(routeTwo);

        Assert.assertEquals(allRoutes.size(), 1);
    }

    @Test
    public static void testAllDrivers() {
        Collection<Driver> allDrivers = new LinkedHashSet<>();
        Driver driverOne = new Driver();
        Driver driverTwo = new Driver();

        driverOne.setGender(Gender.MALE);
        driverOne.setName("Sasha");
        driverOne.setId(1);
        driverOne.setLicenseExpirationDate(new Date(1231212431142L));

        driverTwo.setGender(Gender.MALE);
        driverTwo.setName("Sasha");
        driverTwo.setId(1);
        driverTwo.setLicenseExpirationDate(new Date(1231212431142L));

        allDrivers.add(driverOne);
        allDrivers.add(driverTwo);

        Assert.assertEquals(allDrivers.size(), 1);
    }
}