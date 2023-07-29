package com.gmail.katerynashpak;

public class DrinkMain {
    public static void main(String[] args) {
        DrinkCost.displayAvailableDrinks();

        DrinkCost.DrinkMachine(Drink.COFFEE);
        //DrinkCost.DrinkMachine(Drink.WATER);
        DrinkCost.DrinkMachine(Drink.MOJITO);
    }
}

