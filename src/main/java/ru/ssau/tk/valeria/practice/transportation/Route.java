package ru.ssau.tk.valeria.practice.transportation;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private final List<Location> locations = new ArrayList<>();

    public List<Location> getLocations() {
        return locations;
    }

    public void addNewLocation(Location newLocation) {
        locations.add(newLocation);
    }

    public void addNewLocation(Location newLocation, int index) {
        locations.add(index, newLocation);
    }

    public void removeLocation(int index) {
        locations.remove(index);
    }
}
