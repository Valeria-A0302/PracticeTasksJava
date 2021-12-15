package ru.ssau.tk.valeria.practice.transportation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class Route implements Iterable<Location> {
    private static final double EARTH_RADIUS = 6378.0;
    private final List<Location> locations = new ArrayList<>();

    public List<Location> getLocations() {
        return locations;
    }

    public void addNewLocation(Location newLocation) {
        locations.add(newLocation);
    }

    public void addNewLocation(int index, Location newLocation) {
        locations.add(index, newLocation);
    }

    public void removeLocation(int index) {
        locations.remove(index);
    }

    public Location getFirstLocation() {
        return locations.get(0);
    }

    public Location getLastLocation() {
        return locations.get(locations.size() - 1);
    }

    @Override
    public Iterator<Location> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < locations.size() - 1;
            }

            @Override
            public Location next() {
                if (hasNext()) {
                    return locations.get(index++);
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        };
    }

    public void remove(Location location) {
        for (int index = 0; index < getLocations().size(); index++) {
            if (getLocations().get(index) == location) {
                removeLocation(index);
                break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route locations1 = (Route) o;
        return Objects.equals(locations, locations1.locations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locations);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Location location : getLocations()) {
            stringBuilder.append(location);
            stringBuilder.append('\n');
        }
        return String.valueOf(stringBuilder);
    }

    private double degreeToRad(double degree) {
        return degree * Math.PI / 180.0;
    }

    public double length() {
        if (locations.size() < 2) {
            return 0;
        }
        double length = 0.0;
        for (int element = 0; element < locations.size() - 1; element++) {
            double latitudeOne;
            double longitudeOne;
            double latitudeTwo;
            double longitudeTwo;
            latitudeOne = locations.get(element).getLatitude();
            longitudeOne = locations.get(element).getLongitude();
            latitudeTwo = locations.get(element + 1).getLatitude();
            longitudeTwo = locations.get(element + 1).getLongitude();
            double dLatitude = degreeToRad(latitudeOne - latitudeTwo);
            double dLongitude = degreeToRad(longitudeOne - longitudeTwo);
            double a = Math.sin(dLatitude / 2d) * Math.sin(dLatitude / 2d) +
                    Math.cos(degreeToRad(latitudeOne)) * Math.cos(degreeToRad(latitudeTwo)) *
                            Math.sin(dLongitude / 2d) * Math.sin(dLongitude / 2d);
            double c = 2d * Math.atan2(Math.sqrt(a), Math.sqrt(1d - a));
            length = length + EARTH_RADIUS * c;
        }
        return length;
    }
}
