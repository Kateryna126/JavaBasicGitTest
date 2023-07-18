package com.gmail.katerynashpak;

public class FitnessTracker {
    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phone;
    private String surname;
    private double weight;
    private String bloodPressure;
    private int steps;
    private int age;


    private void calculateAge() {
        int currentYear = 2023;
        age = currentYear - yearOfBirth;
    }
}


