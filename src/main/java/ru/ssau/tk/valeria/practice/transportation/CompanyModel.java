package ru.ssau.tk.valeria.practice.transportation;

import java.util.Collection;
import java.util.LinkedHashSet;

public class CompanyModel {
    Collection<Location> allLocations;
    Collection<Route> allRoutes;
    Collection<Driver> allDrivers;

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
}
