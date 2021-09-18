package ru.ssau.tk.valeria.practice;

public class Testing {
    public static void main(String[] args) {
        Person objectOne = new Person();
        objectOne.getFirstName();
        objectOne.getLastName();
        objectOne.getPassportId();
        System.out.println();

        Person objectTwo = new Person("Valуria","Atapina");
        objectTwo.getFirstName();
        objectTwo.getLastName();
        System.out.println();

        Person objectThree = new Person(4526);
        objectThree.getPassportId();
        System.out.println();

        Person objectFour = new Person ("Ivan","Petrov", 9243);
        objectFour.getFirstName();
        objectFour.getLastName();
        objectFour.getPassportId();
    }
}
