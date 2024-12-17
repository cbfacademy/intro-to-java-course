package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    // Method to get a list of cars
public List<Car> getCars() {
    List<Car> cars = new ArrayList<>();
    // Adding car objects to the list
    cars.add(new Car("Volvo", "V40", "Blue", 2012));
    cars.add(new Car("Porsche", "Panamera", "Red", 2009));
    cars.add(new Car("Audi", "A3", "Grey", 2018));
    return cars;
}
}
