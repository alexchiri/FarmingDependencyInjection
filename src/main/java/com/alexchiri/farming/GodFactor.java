package com.alexchiri.farming;

import com.google.inject.Provider;

import java.util.Random;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class GodFactor implements Provider<Weather> {
    @Override
    public Weather get() {
        int n = new Random().nextInt();
        System.out.println("The random number that decides what kind of weather our Farmer has is: " + n);

        Weather weather = null;

        if(n%3 == 0) {
            System.out.println("It's gonna be a DryWeather!");
            weather = new DryWeather();
        } else if(n%3 == 1){
            System.out.println("It's gonna be a MildWeather!");
            weather = new MildWeather();
        } else {
            System.out.println("It's gonna be a WetWeather!");
            weather = new WetWeather();
        }

        return weather;
    }
}
