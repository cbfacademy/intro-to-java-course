package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    protected double radius;
    protected double height;

    public Cylinder(double radius, double height) {
        this.name = "Cylinder";
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * Math.PI * (radius * radius);
    }
}