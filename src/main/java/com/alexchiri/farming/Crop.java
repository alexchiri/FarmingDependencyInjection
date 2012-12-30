package com.alexchiri.farming;

/**
 * Alexandru Chiritescu
 * 30-12-12
 */
public class Crop {
    private String name;
    private CropQuantity quantity;

    public Crop(String name, CropQuantity quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CropQuantity getQuantity() {
        return quantity;
    }

    public void setQuantity(CropQuantity quantity) {
        this.quantity = quantity;
    }
}
