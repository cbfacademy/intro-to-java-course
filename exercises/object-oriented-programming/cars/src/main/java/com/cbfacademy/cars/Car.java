package com.cbfacademy.cars;

public class Car {
    
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDetails() {
        return "Make: " + make + ", Model: " + model + ", Colour: " + colour + ", Year: " + year;
    }
} 