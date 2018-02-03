package com.brakeel.carros.entities;

import android.graphics.drawable.Drawable;

/**
 * Created by Kelvis Borges on 02/02/2018.
 */

public class Car {

    public int id;
    public String model;
    public String manuFacturer;
    public int horsePower;
    public Double price;
    public Drawable picture;

    public Car(int id, String model, String manuFacturer, int horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.manuFacturer = manuFacturer;
        this.horsePower = horsePower;
        this.price = price;
        this.picture = picture;
    }
}
