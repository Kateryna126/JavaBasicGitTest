package com.gmail.katerynashpak;

public class Main {
    public static void main(String[] args) {
        FitnessTracker anna = new FitnessTracker("Anna", 7, 6, 1990, "oksana@example.com", "+380501234567", "Shevchenko", 60.0, "110/70", 12000);
        FitnessTracker taras = new FitnessTracker("Taras", 8, 5, 1985, "taras@example.com", "+380501234568", "Kovalenko", 80.0, "120/80", 5000);
        FitnessTracker natalia = new FitnessTracker("Natalia", 9, 4, 2000, "natalia@example.com", "+380501234569", "Petrenko", 55.0, "120/90", 7000);

        FitnessTracker[] users = {anna, taras, natalia};
        for (FitnessTracker user : users) {
            user.printAccountInfo();
        }

        System.out.println("Parameters with changes");

        anna.setWeight(75.0);
        taras.setSteps(15000);

        anna.printAccountInfo();
        taras.printAccountInfo();
    }
}
