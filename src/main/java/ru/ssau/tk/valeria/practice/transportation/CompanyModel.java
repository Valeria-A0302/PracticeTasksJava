package ru.ssau.tk.valeria.practice.transportation;

import ru.ssau.tk.valeria.practice.Gender;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;

public class CompanyModel {
    Collection<Location> allLocations;
    Collection<Route> allRoutes;
    Collection<Driver> allDrivers;
    private int maxId = 0;

    public Collection<Location> getAllLocations() {
        return allLocations;
    }

    public Collection<Route> getAllRoutes() {
        return allRoutes;
    }

    public Collection<Driver> getAllDrivers() {
        return allDrivers;
    }

    public CompanyModel() {
        allLocations = new LinkedHashSet<>();
        allRoutes = new LinkedHashSet<>();
        allDrivers = new LinkedHashSet<>();
    }

    public Settlement addSettlement(String name, double latitude, double longitude, SettlementType type, int population) {
        Settlement settlement = new Settlement();
        settlement.setId(++maxId);
        settlement.setName(name);
        settlement.setLatitude(latitude);
        settlement.setLongitude(longitude);
        settlement.setType(type);
        settlement.setSettlement(population);
        allLocations.add(settlement);

        return settlement;
    }

    public Waypoint addWaypoint(String name, double latitude, double longitude, WaypointType type, Settlement settlement) {
        Waypoint waypoint = new Waypoint();
        waypoint.setId(++maxId);
        waypoint.setName(name);
        waypoint.setLatitude(latitude);
        waypoint.setLongitude(longitude);
        waypoint.setType(type);
        waypoint.setSettlement(settlement);
        allLocations.add(waypoint);

        return waypoint;
    }

    public Driver addDriver(String name, Gender gender, Date licenseExpirationDate) {
        Driver driver = new Driver();
        driver.setId(++maxId);
        driver.setName(name);
        driver.setGender(gender);
        driver.setLicenseExpirationDate(licenseExpirationDate);
        allDrivers.add(driver);

        return driver;
    }

    public Route addRoute(List<Location> locations) {
        Route route = new Route();
        for (Location element : locations) {
            route.addNewLocation(element);
        }
        allRoutes.add(route);
        return route;
    }
}
