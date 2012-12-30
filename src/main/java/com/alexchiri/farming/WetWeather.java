package com.alexchiri.farming;

import java.util.ArrayList;
import java.util.List;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class WetWeather implements Weather {
    @Override
    public List<Crop> getCrops() {
        List<Crop> crops = new ArrayList<Crop>();

        crops.add(new Crop("Rice", CropQuantity.HIGH));

        return crops;
    }
}
