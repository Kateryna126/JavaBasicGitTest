package com.gmail.katerynashpak;

import java.util.Scanner;

public class DrinkMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinkCost.displayAvailableDrinks();


        }
        System.out.println("Total number of drinks: " + DrinkCost.totalDrinks);
        System.out.println("Total cost: " + DrinkCost.totalCost);
    }
}

