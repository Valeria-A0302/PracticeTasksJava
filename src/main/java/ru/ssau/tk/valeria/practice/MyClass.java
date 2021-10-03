package ru.ssau.tk.valeria.practice;

public class MyClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson();
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson() {
        Person person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }
}
