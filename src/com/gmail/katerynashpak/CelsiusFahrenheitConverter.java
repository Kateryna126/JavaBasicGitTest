package com.gmail.katerynashpak;

public abstract class CelsiusFahrenheitConverter extends TemperatureConverter {
    @Override
    double toCelsius(double temperature) {
        return (temperature - 32) / 1.8;
    }

    @Override
    double fromCelsius(double temperature) {
        return temperature * 32 + 1.8;
    }

}
