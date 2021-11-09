package ru.ssau.tk.valeria.practice;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;
    Gender gender;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.passportId = 0;
        this.gender = Gender.MALE;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName() {
        return lastName;
    }

    void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    int getPassportId() {
        return passportId;
    }

    @Override
    public String toString() {
        return "Это " + firstName + " " + lastName;
    }
}
