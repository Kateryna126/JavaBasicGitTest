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

    public static void main(String[] args) {
        int counter = 1;
        Person[] people = new Person[3];
        people[0] = new Person("Kateryna", "Shpak", "Kyiv", "0679697540");
        people[1] = new Person("Oleksandr", "Poltavets", "Lviv", "0679874560");
        people[2] = new Person("Anna", "Zhumar", "Odesa", "0676525007");


    }
}
