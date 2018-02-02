package com.brakeel.carros.data;

import com.brakeel.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kelvis Borges on 02/02/2018.
 */

public class CarMock {
    private List<Car> mListCar;

    public CarMock() {
        this.mListCar = new ArrayList<>();
        for (int i = 0; i <= 100; i++){
            this.mListCar.add(new Car(i, String.valueOf(i), i*100, Double.valueOf(i*100)));
        }

    }

    public List<Car> getList() {
        return this.mListCar;
    }

    public Car get(int id) {
        return this.mListCar.get(id);
    }

}

