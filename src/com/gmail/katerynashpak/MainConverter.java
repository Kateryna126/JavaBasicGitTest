package com.gmail.katerynashpak;

import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) {
        TemperatureConverter celsiusFahrenheitConverter = new CelsiusFahrenheitConverter();
        TemperatureConverter celsiusKelvinConverter = new CelsiusKelvinConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble();

        System.out.println(celsius + "°C to Fahrenheit: " + celsiusFahrenheitConverter.fromCelsius(celsius));
        System.out.println(celsius + "°C to Kelvin: " + celsiusKelvinConverter.fromCelsius(celsius));

        System.out.println("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        System.out.println(fahrenheit + "°F to Celsius: " + celsiusFahrenheitConverter.toCelsius(fahrenheit));

        System.out.println("Enter a temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();

        System.out.println(kelvin + "K to Celsius: " + celsiusKelvinConverter.toCelsius(kelvin));

    }
}
