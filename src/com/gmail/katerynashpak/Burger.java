package com.gmail.katerynashpak;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        System.out.println("Classic Burger Ingredients:");
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        displayIngredients();
    }

    private void displayIngredients() {
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Greens: " + greens);
        System.out.println("Mayo: " + mayo);
        System.out.println();
    }
}







