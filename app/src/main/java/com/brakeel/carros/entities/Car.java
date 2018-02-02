package com.brakeel.carros.entities;

/**
 * Created by Kelvis Borges on 02/02/2018.
 */

public class Car {

    public int id;
    public String model;
    public int horsePower;
    public Double price;

    public Car(int id, String model, int horsePower, Double price) {
        this.id = id;
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
    }


}
