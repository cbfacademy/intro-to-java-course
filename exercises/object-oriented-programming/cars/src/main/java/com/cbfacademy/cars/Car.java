package com.cbfacademy.cars;
public class Car {
    //Private members
    private String make;
    private String model;
    private String colour;
    private int year;      

    // Constructor
    public Car(String make, String model, String colour, int year) {
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.year = year;
    }

    // Getter for make
    public String getMake() {
    return make;
  }

  // Getter for model
  public String getModel() {
  return model;
  } 

  // Getter for year
  public int getYear() {
  return year;
  }

  // Getter for colour
  public String getColour() {
    return colour;
  }

  // Setter for colour
  public void setColour (String colour) {
    this.colour = colour;
      }

    // Method to get car details
    public String getDetails() {
        return "Make: " + make + ", Model: " + model + ", Colour: " + colour + ", Year: " + year;
    }
}