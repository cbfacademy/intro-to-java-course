package com.cbfacademy.shapes;

public class Sphere extends Shape {

    private double radius;

    Sphere(double radius) {;    
        this.radius = radius;
}

  @Override
  public double getArea() {

 return 4 * Math.PI * Math.pow(radius, 2); 
  }

  public double getRadius() {
    return radius;
  }
}

