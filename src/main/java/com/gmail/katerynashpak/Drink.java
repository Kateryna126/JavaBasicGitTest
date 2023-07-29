package com.gmail.katerynashpak;

enum Drink {
    COFFEE, TEA, LEMONADE, MOJITO, WATER, COCA_COLA
}

class DrinkCost {
    static final double COFFEE_COST = 45.0;
    static final double TEA_COST = 22.0;
    static final double LEMONADE_COST = 54.0;
    static final double MOJITO_COST = 56.0;
    static final double WATER_COST = 10.0;
    static final double COCA_COLA_COST = 15.0;

    static int totalDrinks = 0;
    static double totalCost = 0;

    static void DrinkMachine(Drink drink) {
        switch (drink) {
            case COFFEE:
                System.out.println("Making coffee");
                totalCost += COFFEE_COST;
                break;
            case TEA:
                System.out.println("Making tea");
                totalCost += TEA_COST;
                break;
            case LEMONADE:
                System.out.println("Making lemonade");
                totalCost += LEMONADE_COST;
                break;
            case MOJITO:
                System.out.println("Making mojito");
                totalCost += MOJITO_COST;
                break;
            case WATER:
                System.out.println("Pouring water");
                totalCost += WATER_COST;
                break;
            case COCA_COLA:
                System.out.println("Pouring Coca-Cola");
                totalCost += COCA_COLA_COST;
                break;
        }
        totalDrinks++;
    }

    static void displayAvailableDrinks() {
        System.out.println("Available drinks:");
        for (Drink drink : Drink.values()) {
            System.out.println(drink);
        }
    }
}