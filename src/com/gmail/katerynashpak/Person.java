package com.gmail.katerynashpak;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phoneNumber;

    public Person(String name, String surname, String city, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return "Call citizen " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber + ".";
    }
}
