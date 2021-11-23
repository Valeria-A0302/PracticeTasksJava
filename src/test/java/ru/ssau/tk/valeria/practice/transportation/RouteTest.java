package ru.ssau.tk.valeria.practice.transportation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class RouteTest {

    @Test
    public void testGetterAndAddNewLocation() {
        Route route = new Route();
        Location city = new Settlement();
        city.setName("Самара");
        Location villageOne = new Waypoint();
        villageOne.setName("Муханово");
        Location villageTwo = new Waypoint();
        villageTwo.setName("Рак");
        Location villageThree = new Waypoint();
        villageThree.setName("Безенчук");
        Location villageFour = new Settlement();
        villageFour.setName("Бебуа");
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
        route.addNewLocation(villageThree);
        route.addNewLocation(1, villageFour);
        List<Location> locations = new ArrayList<>();
        locations.add(city);
        locations.add(villageFour);
        locations.add(villageOne);
        locations.add(villageTwo);
        locations.add(villageThree);
        Assert.assertEquals(route.getLocations(), locations);
    }

    @Test
    public void testRemoveLocation() {
        Route route = new Route();
        Location city = new Settlement();
        city.setName("Самара");
        Location villageOne = new Waypoint();
        villageOne.setName("Муханово");
        Location villageTwo = new Waypoint();
        villageTwo.setName("Рак");
        Location villageThree = new Waypoint();
        villageThree.setName("Безенчук");
        Location villageFour = new Settlement();
        villageFour.setName("Бебуа");
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
        route.addNewLocation(villageThree);
        route.addNewLocation(1, villageFour);
        route.removeLocation(0);
        route.removeLocation(0);
        route.removeLocation(0);
        route.removeLocation(0);
        route.removeLocation(0);
        Assert.assertEquals(route.getLocations(), new ArrayList<>());
    }

    @Test
    public static void testIterator() {
        Route route = new Route();
        Location city = new Settlement();
        city.setId(0);
        Location villageOne = new Waypoint();
        villageOne.setId(1);
        Location villageTwo = new Settlement();
        villageTwo.setId(2);
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
        int index = 0;
        for (Location location : route) {
            Assert.assertEquals(location.getId(), index++);
        }
        Assert.assertEquals(route.getLocations().size(), ++index);
    }

    @Test
    public static void testGetterFirstAndLastLocations() {
        Route route = new Route();
        Location city = new Settlement();
        city.setName("Самара");
        Location villageOne = new Waypoint();
        villageOne.setName("Безенчук");
        Location villageTwo = new Settlement();
        villageTwo.setName("Бебуа");
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
        Assert.assertEquals(route.getFirstLocation().getName(), "Самара");
        Assert.assertEquals(route.getLastLocation().getName(), "Бебуа");
    }

    @Test
    public static void testRemove() {
        Route route = new Route();

        Location city = new Settlement();
        city.setName("Пувуа");
        city.setId(123);
        city.setLatitude(234.55);
        city.setLongitude(345.75);

        Location villageOne = new Waypoint();
        villageOne.setName("Мнио");
        villageOne.setId(345);
        villageOne.setLatitude(123.45);
        villageOne.setLongitude(789.65);

        Location villageTwo = new Settlement();
        villageTwo.setName("Бебуа");
        villageTwo.setId(567);
        villageTwo.setLatitude(275.89);
        villageTwo.setLongitude(195.38);

        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);

        Location locationOne = new Location();
        locationOne.setName("Мнио");
        locationOne.setId(345);
        locationOne.setLatitude(123.45);
        locationOne.setLongitude(789.65);

        route.remove(locationOne);

        List<Location> locations = new ArrayList<>();
        locations.add(city);
        locations.add(villageOne);
        locations.add(villageTwo);

        Assert.assertEquals(route.getLocations(), locations);

        locationOne.setName("Самбува");
        locationOne.setId(345);
        locationOne.setLatitude(752.341);
        locationOne.setLongitude(1234.865);
        route.remove(locationOne);

        Assert.assertEquals(route.getLocations(), locations);

        locationOne.setName("Самбува");
        locationOne.setId(781);
        locationOne.setLatitude(752.341);
        locationOne.setLongitude(1234.865);

        Assert.assertEquals(route.getLocations(), locations);
    }
}