package com.alexchiri.farming;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.List;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class Farmer {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Land());

        int years = 5;

        if (args != null && args.length > 0 && args[0] != null && Integer.parseInt(args[0]) > 0) {
            years = Integer.parseInt(args[0]);
        }

        System.out.println("Let's see what crops gets the Farmer in the next " + years + " years!");
        for (int i = 0; i < years; i++) {
            playFarm(injector, i);
        }
    }

    private static void playFarm(Injector injector, int i) {
        System.out.println();
        Farm farm = injector.getInstance(Farm.class);
        List<Crop> crops = farm.gatherCrops();
        System.out.println("In year " + (i + 1) + " the Farmer got the following Crops:");
        for(Crop c: crops) {
            System.out.println(c.getName() + " in " + c.getQuantity().toString() + " quantity.");
        }
    }
}
