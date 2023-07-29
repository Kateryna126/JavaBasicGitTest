package com.gmail.katerynashpak;

import java.util.Scanner;

public class DrinkMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinkCost.displayAvailableDrinks();

        boolean choosingDrinks = true;
        while (choosingDrinks) {
            System.out.println("Please choose a drink (enter the name or 'done' to finish):");
            String drinkChoice = scanner.nextLine().toUpperCase();

            if (drinkChoice.equals("DONE")) {
                choosingDrinks = false;
            } else {
                DrinkCost.DrinkMachine(Drink.valueOf(drinkChoice));
            }

        }
        System.out.println("Total number of drinks: " + DrinkCost.totalDrinks);
        System.out.println("Total cost: " + DrinkCost.totalCost);
    }
}

