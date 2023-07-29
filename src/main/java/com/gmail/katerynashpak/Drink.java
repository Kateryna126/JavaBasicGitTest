package com.gmail.katerynashpak;

enum Drink {
    COFFEE, TEA, LEMONADE, MOJITO, WATER, COCA_COLA
}

class DrinkCost{
    static final double COFFEE_COST = 45.0;
    static final double TEA_COST = 22.0;
    static final double LEMONADE_COST = 54.0;
    static final double MOJITO_COST = 56.0;
    static final double WATER_COST = 10.0;
    static final double COCA_COLA_COST = 15.0;

    static int totalDrinks = 0;
    static double totalCost = 0;
}