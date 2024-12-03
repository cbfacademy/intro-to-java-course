package com.cbfacademy.shapes;

public class Sphere extends Shape {

  private double radius;

  Sphere(double radius) {
    this.radius = radius;
  }
  
  @Override
  double getArea() {
    return 4 * Math.PI * (this.radius * this.radius);
  }
}


// Sphere mySphere = new Sphere(3.2);