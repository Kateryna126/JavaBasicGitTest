package com.gmail.katerynashpak;

public class FitnessTracker {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;
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

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    private void calculateAge() {
        int currentYear = 2023;
        age = currentYear - yearOfBirth;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + surname);
        System.out.println("Date of Birth: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps Per Day: " + steps);
        System.out.println();
    }
}



