package com.cbfacademy.cars;

import java.util.List;

public class App {
    public static void main(String[] args) {

        // Instantiate a Showroom object
     Showroom showroom = new Showroom();
      List<Car> cars = showroom.getCars();

    for (Car car : cars) {
     System.out.println(car);
    }
}
}