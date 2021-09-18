package ru.ssau.tk.valeria.practice;

public class Testing {
    public static void main(String[] args) {
        Person objectOne = new Person();

        objectOne.setFirstName("Ildar");
        objectOne.getFirstName();

        objectOne.setLastName("Idiyatov");
        objectOne.getLastName();

        objectOne.setPassportId(5764);
        objectOne.getPassportId();

        Person objectTwo = new Person();

        objectTwo.setFirstName("Valeria");
        objectTwo.getFirstName();

        objectTwo.setLastName("Atapina");
        objectTwo.getLastName();

        objectTwo.setPassportId(2352);
        objectTwo.getPassportId();

        Person objectThree = new Person();

        objectThree.setFirstName("Ivan");
        objectThree.getFirstName();

        objectThree.setLastName("Ivanov");
        objectThree.getLastName();

        objectThree.setPassportId(3423);
        objectThree.getPassportId();
    }
}
