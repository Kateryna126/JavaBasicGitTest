package com.gmail.katerynashpak;

enum Drink {
    COFFEE, TEA, LEMONADE, MOJITO, WATER, COCA_COLA
}

public class DrinkMachine {
    static final double COFFEE_COST = 45.0;
    static final double TEA_COST = 22.0;
    static final double LEMONADE_COST = 54.0;
    static final double MOJITO_COST = 56.0;
    static final double WATER_COST = 10.0;
    static final double COCA_COLA_COST = 15.0;

    static int totalDrinks = 0;
    static double totalCost = 0;

    public static void makeDrink(Drink drink) {
        switch (drink) {
            case COFFEE:
                makeCoffee();
                break;
            case TEA:
                makeTea();
                break;
            case LEMONADE:
                makeLemonade();
                break;
            case MOJITO:
                makeMojito();
                break;
            case WATER:
                pourWater();
                break;
            case COCA_COLA:
                pourCocaCola();
                break;
        }
        totalDrinks++;
    }

    public static void displayAvailableDrinks() {
        System.out.println("Available drinks:");
        for (Drink drink : Drink.values()) {
            System.out.println(drink);
        }
    }

    public static int getTotalDrinks() {
        return totalDrinks;
    }

    public static double getTotalCost() {
        return totalCost;
    }

    private static void makeCoffee() {
        System.out.println("Making coffee...");
        totalCost += COFFEE_COST;
    }

    private static void makeTea() {
        System.out.println("Making tea...");
        totalCost += TEA_COST;
    }

    private static void makeLemonade() {
        System.out.println("Making lemonade...");
        totalCost += LEMONADE_COST;
    }

    private static void makeMojito() {
        System.out.println("Making mojito...");
        totalCost += MOJITO_COST;
    }

    private static void pourWater() {
        System.out.println("Pouring water...");
        totalCost += WATER_COST;
    }

    private static void pourCocaCola() {
        System.out.println("Pouring Coca-Cola...");
        totalCost += COCA_COLA_COST;
    }
}