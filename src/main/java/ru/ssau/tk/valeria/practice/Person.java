package ru.ssau.tk.valeria.practice;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;
    public Person (){
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.passportId = 0;
    }

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person (int passportId){
        this.passportId = passportId;
    }
    public Person (String firstName, String lastName, int passportId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    void setFirstName(String firstName){ this.firstName = firstName; }
    void getFirstName(){
        System.out.println("First name: "+firstName);
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    void getLastName(){
        System.out.println("Last name: "+lastName);
    }
    void setPassportId(int passportId){
        this.passportId = passportId;
    }
    void getPassportId(){
        System.out.println("Passport ID: "+passportId);
    }

}
