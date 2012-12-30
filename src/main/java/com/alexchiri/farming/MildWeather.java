package com.alexchiri.farming;

import java.util.ArrayList;
import java.util.List;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class MildWeather implements Weather {
    @Override
    public List<Crop> getCrops() {
        List<Crop> crops = new ArrayList<Crop>();

        crops.add(new Crop("Black-eyed beans", CropQuantity.HIGH));
        crops.add(new Crop("Tomatoes", CropQuantity.MEDIUM));
        crops.add(new Crop("Melons", CropQuantity.MEDIUM));
        crops.add(new Crop("Cabbage", CropQuantity.HIGH));
        crops.add(new Crop("Broccoli", CropQuantity.HIGH));


        return crops;
    }
}
