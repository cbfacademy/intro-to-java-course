package com.cbfacademy.cars;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Instantiate Showroom
        Showroom showroom = new Showroom();

        // Get the list of cars from the showroom
        List<Car> cars = showroom.getCars();

        // Print details for each car in the list
        for (Car car : cars) {
            System.out.println(car.getDetails());
        }
    }
}
