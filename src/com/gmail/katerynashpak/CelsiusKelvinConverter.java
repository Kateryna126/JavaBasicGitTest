package com.gmail.katerynashpak;

public abstract class CelsiusKelvinConverter extends TemperatureConverter {

    @Override
    double toCelsius(double temperature){
        return temperature - 273.15;
    }

    @Override
    double fromCelsius(double temperature){
        return temperature + 273.15;
    }
}
