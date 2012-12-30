package com.alexchiri.farming;

import java.util.ArrayList;
import java.util.List;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class DryWeather implements Weather {
    @Override
    public List<Crop> getCrops() {
        List<Crop> crops = new ArrayList<Crop>();

        crops.add(new Crop("Black-eyed beans", CropQuantity.MEDIUM));
        crops.add(new Crop("Tomatoes", CropQuantity.LOW));
        crops.add(new Crop("Melons", CropQuantity.LOW));

        return crops;
    }
}
