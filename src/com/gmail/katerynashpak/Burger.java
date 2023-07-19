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

    public Burger(String bun, String meat, String cheese, String greens) {
        System.out.println("Diet Burger Ingredients:");
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = null;
        displayIngredients();
    }

    public Burger(String bun, String meat,boolean doubleMeat) {
        System.out.println("Double Meat Burger Ingredients:");
        this.bun = bun;
        if (doubleMeat) {
            this.meat = "Double " + meat;
        } else {
            this.meat = meat;
        }
        this.cheese = null;
        this.greens = null;
        this.mayo = null;
        displayIngredients();
    }

    private void displayIngredients() {
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + (cheese != null ? cheese : "No cheese"));
        System.out.println("Greens: " + (greens != null ? greens : "No greens"));
        System.out.println("Mayo: " + (mayo != null ? mayo : "No mayo"));
        System.out.println();
    }
}







