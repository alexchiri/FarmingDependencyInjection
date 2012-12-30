package com.alexchiri.farming;

import com.google.inject.Inject;

import java.util.List;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class Farm {
    private Weather weather;

    @Inject
    public Farm(Weather weather) {
        this.weather = weather;
    }

    public List<Crop> gatherCrops() {
        return weather.getCrops();
    }
}
