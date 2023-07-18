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

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phone, String surname, double weight, String bloodPressure, int steps) {
        this.name = name;
        this.dayOfBirth = birthDay;
        this.monthOfBirth = birthMonth;
        this.yearOfBirth = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.steps = steps;
        calculateAge();
    }

    private void calculateAge() {
        int currentYear = 2023;
        age = currentYear - yearOfBirth;
    }
}


