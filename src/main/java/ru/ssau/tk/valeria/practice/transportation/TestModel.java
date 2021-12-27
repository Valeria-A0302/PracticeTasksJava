package ru.ssau.tk.valeria.practice.transportation;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ru.ssau.tk.valeria.practice.Gender.*;
import static ru.ssau.tk.valeria.practice.transportation.SettlementType.*;
import static ru.ssau.tk.valeria.practice.transportation.WaypointType.*;

public class TestModel {
    protected Settlement settlementOne = new Settlement();
    protected Settlement settlementTwo = new Settlement();
    protected Settlement settlementThree = new Settlement();
    protected Settlement settlementFour = new Settlement();
    protected Settlement settlementFive = new Settlement();
    protected Settlement settlementSix = new Settlement();
    protected Settlement settlementSeven = new Settlement();
    protected Settlement settlementEight = new Settlement();
    protected Settlement settlementNine = new Settlement();
    protected Settlement settlementTen = new Settlement();

    protected Waypoint waypointOne = new Waypoint();
    protected Waypoint waypointTwo = new Waypoint();
    protected Waypoint waypointThree = new Waypoint();
    protected Waypoint waypointFour = new Waypoint();
    protected Waypoint waypointFive = new Waypoint();
    protected Waypoint waypointSix = new Waypoint();
    protected Waypoint waypointSeven = new Waypoint();
    protected Waypoint waypointEight = new Waypoint();
    protected Waypoint waypointNine = new Waypoint();
    protected Waypoint waypointTen = new Waypoint();

    protected Driver driverOne = new Driver();
    protected Driver driverTwo = new Driver();
    protected Driver driverThree = new Driver();
    protected Driver driverFour = new Driver();
    protected Driver driverFive = new Driver();

    protected Date dateOne;
    protected Date dateTwo;
    protected Date dateThree;
    protected Date dateFour;
    protected Date dateFive;

    protected Route routeOne = new Route();
    protected Route routeTwo = new Route();
    protected Route routeThree = new Route();
    protected Route routeFour = new Route();
    protected Route routeFive = new Route();

    public TestModel() {
        settlementOne.setSettlement(53442);
        settlementOne.setType(CITY);
        settlementOne.setId(1234);
        settlementOne.setName("Bebua");
        settlementOne.setLatitude(23.54);
        settlementOne.setLongitude(45.32);

        settlementTwo.setSettlement(67890);
        settlementTwo.setType(VILLAGE);
        settlementTwo.setId(3276);
        settlementTwo.setName("Ororo");
        settlementTwo.setLatitude(34.54);
        settlementTwo.setLongitude(67.53);

        settlementThree.setSettlement(78345);
        settlementThree.setType(VILLAGE);
        settlementThree.setId(4563);
        settlementThree.setName("Almetyevsk");
        settlementThree.setLatitude(89.34);
        settlementThree.setLongitude(102.45);

        settlementFour.setSettlement(45320);
        settlementFour.setType(CITY);
        settlementFour.setId(1092);
        settlementFour.setName("MarsInEarth");
        settlementFour.setLatitude(23.89);
        settlementFour.setLongitude(41.23);

        settlementFive.setSettlement(32560);
        settlementFive.setType(VILLAGE);
        settlementFive.setId(1197);
        settlementFive.setName("Sabancha");
        settlementFive.setLatitude(11.24);
        settlementFive.setLongitude(23.34);

        settlementSix.setSettlement(2);
        settlementSix.setType(CITY);
        settlementSix.setId(5432);
        settlementSix.setName("LeraAndIldar");
        settlementSix.setLatitude(67.89);
        settlementSix.setLongitude(78.89);

        settlementSeven.setSettlement(33452);
        settlementSeven.setType(VILLAGE);
        settlementSeven.setId(1742);
        settlementSeven.setName("Levar");
        settlementSeven.setLatitude(81.36);
        settlementSeven.setLongitude(78.32);

        settlementSeven.setSettlement(1234567);
        settlementSeven.setType(CITY);
        settlementSeven.setId(7809);
        settlementSeven.setName("Varum");
        settlementSeven.setLatitude(34.51);
        settlementSeven.setLongitude(68.32);

        settlementEight.setSettlement(3456098);
        settlementEight.setType(CITY);
        settlementEight.setId(8347);
        settlementEight.setName("Murakami");
        settlementEight.setLatitude(30.42);
        settlementEight.setLongitude(70.93);

        settlementNine.setSettlement(11783);
        settlementNine.setType(VILLAGE);
        settlementNine.setId(5934);
        settlementNine.setName("Biruka");
        settlementNine.setLatitude(99.23);
        settlementNine.setLongitude(77.32);

        settlementTen.setSettlement(8945);
        settlementTen.setType(VILLAGE);
        settlementTen.setId(9011);
        settlementTen.setName("River");
        settlementTen.setLatitude(105.23);
        settlementTen.setLongitude(110.54);

        waypointOne.setSettlement(settlementOne);
        waypointOne.setType(DEPOT);
        waypointOne.setId(4321);
        waypointOne.setName("Sambuar");
        waypointOne.setLatitude(24.56);
        waypointOne.setLongitude(42.34);

        waypointTwo.setSettlement(settlementTwo);
        waypointTwo.setType(WAREHOUSE);
        waypointTwo.setId(9871);
        waypointTwo.setName("Juja");
        waypointTwo.setLatitude(16.32);
        waypointTwo.setLongitude(10.11);

        waypointThree.setSettlement(settlementThree);
        waypointThree.setType(EMPTY);
        waypointThree.setId(6731);
        waypointThree.setName("Arbuz");
        waypointThree.setLatitude(20.31);
        waypointThree.setLongitude(25.73);

        waypointFour.setSettlement(settlementFour);
        waypointFour.setType(WAREHOUSE);
        waypointFour.setId(4632);
        waypointFour.setName("Ujos");
        waypointFour.setLatitude(43.65);
        waypointFour.setLongitude(21.11);

        waypointFive.setSettlement(settlementFive);
        waypointFive.setType(DEPOT);
        waypointFive.setId(8462);
        waypointFive.setName("Blabla");
        waypointFive.setLatitude(123.59);
        waypointFive.setLongitude(111.23);

        waypointSix.setSettlement(settlementSix);
        waypointSix.setType(DEPOT);
        waypointSix.setId(1122);
        waypointSix.setName("Popipu");
        waypointSix.setLatitude(102.22);
        waypointSix.setLongitude(100.01);

        waypointSeven.setSettlement(settlementSeven);
        waypointSeven.setType(EMPTY);
        waypointSeven.setId(3133);
        waypointSeven.setName("Dobro");
        waypointSeven.setLatitude(37.31);
        waypointSeven.setLongitude(43.21);

        waypointEight.setSettlement(settlementEight);
        waypointEight.setType(WAREHOUSE);
        waypointEight.setId(1111);
        waypointEight.setName("Timka");
        waypointEight.setLatitude(56.83);
        waypointEight.setLongitude(60.35);

        waypointNine.setSettlement(settlementNine);
        waypointNine.setType(EMPTY);
        waypointNine.setId(2222);
        waypointNine.setName("Arkmfa");
        waypointNine.setLatitude(33.98);
        waypointNine.setLongitude(38.32);

        waypointTen.setSettlement(settlementTen);
        waypointTen.setType(DEPOT);
        waypointTen.setId(5757);
        waypointTen.setName("Vapra");
        waypointTen.setLatitude(57.31);
        waypointTen.setLongitude(50.22);

        dateOne = new Date(1845691465451351L);
        dateTwo = new Date(1341063461643916L);
        dateThree = new Date(4516941061686510874L);
        dateFour = new Date(7491759716451647015L);
        dateFive = new Date(7643519743975634695L);

        driverOne.setId(2345);
        driverOne.setName("Sasha");
        driverOne.setGender(MALE);
        driverOne.setLicenseExpirationDate(dateOne);

        driverTwo.setId(1928);
        driverTwo.setName("Julia");
        driverTwo.setGender(FEMALE);
        driverTwo.setLicenseExpirationDate(dateTwo);

        driverThree.setId(3926);
        driverThree.setName("Roman");
        driverThree.setGender(MALE);
        driverThree.setLicenseExpirationDate(dateThree);

        driverFour.setId(6820);
        driverFour.setName("Amber");
        driverFour.setGender(FEMALE);
        driverFour.setLicenseExpirationDate(dateFour);

        driverFive.setId(3771);
        driverFive.setName("John");
        driverFive.setGender(MALE);
        driverFive.setLicenseExpirationDate(dateFive);

        routeOne.addNewLocation(settlementOne);
        routeOne.addNewLocation(waypointOne);
        routeOne.addNewLocation(settlementThree);
        routeOne.addNewLocation(waypointTwo);

        routeTwo.addNewLocation(settlementTwo);
        routeTwo.addNewLocation(waypointThree);
        routeTwo.addNewLocation(waypointOne);
        routeTwo.addNewLocation(waypointTwo);
        routeTwo.addNewLocation(settlementThree);

        routeThree.addNewLocation(settlementEight);
        routeThree.addNewLocation(waypointFour);
        routeThree.addNewLocation(waypointEight);
        routeThree.addNewLocation(waypointSix);
        routeThree.addNewLocation(settlementSix);
        routeThree.addNewLocation(waypointNine);
        routeThree.addNewLocation(settlementSeven);

        routeFour.addNewLocation(waypointTwo);
        routeFour.addNewLocation(settlementFour);
        routeFour.addNewLocation(settlementTen);
        routeFour.addNewLocation(settlementFive);
        routeFour.addNewLocation(waypointTen);
        routeFour.addNewLocation(waypointSeven);
        routeFour.addNewLocation(settlementNine);
        routeFour.addNewLocation(settlementThree);
        routeFour.addNewLocation(waypointFive);

        routeFive.addNewLocation(waypointSix);
        routeFive.addNewLocation(settlementEight);
    }

    public List<Waypoint> getAllWaypoints() {
        return Stream.of(waypointOne, waypointTwo, waypointThree, waypointFour, waypointFive, waypointSix, waypointSeven, waypointEight, waypointNine, waypointTen)
                .collect(Collectors.toList());
    }

    public List<Settlement> getAllSettlements() {
        return Stream.of(settlementOne, settlementTwo, settlementThree, settlementFour, settlementFive, settlementSix, settlementSeven, settlementEight, settlementNine, settlementTen)
                .collect(Collectors.toList());
    }

    public List<Driver> getAllDrivers() {
        return Stream.of(driverOne, driverTwo, driverThree, driverFour, driverFive)
                .collect(Collectors.toList());
    }

    public List<Route> getAllRoute() {
        return Stream.of(routeOne, routeTwo, routeThree, routeFour, routeFive)
                .collect(Collectors.toList());
    }
}