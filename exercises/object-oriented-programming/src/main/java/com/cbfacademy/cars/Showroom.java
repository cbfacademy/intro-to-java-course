package com.cbfacademy.cars;


import java.util.List;
import java.util.ArrayList;

public class Showroom {
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volvo", "V40", "Blue", 2012));
        cars.add(new Car("Porsche", "Panamera", "Red", 2009));
        cars.add(new Car("Audi", "A3", "Grey", 2018));
        return cars;
    }
}

