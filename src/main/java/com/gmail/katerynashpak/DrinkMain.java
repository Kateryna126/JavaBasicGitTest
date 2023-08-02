package com.gmail.katerynashpak;

import java.util.Scanner;

public class DrinkMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DrinkMachine.displayAvailableDrinks();


        while (true) {
            System.out.println("Please choose a drink (enter the name or 'done' to finish):");

            String drinkChoice = scanner.nextLine().toUpperCase();

            if (drinkChoice.equals("DONE")) {
                break;
            } else {
                DrinkMachine.makeDrink(Drink.valueOf(drinkChoice));
            }

        }
        System.out.println("Total number of drinks: " + DrinkMachine.getTotalDrinks());
        System.out.println("Total cost: " + DrinkMachine.getTotalCost());
    }
}

