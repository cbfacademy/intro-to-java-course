package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * Math.PI * Math.pow(radius, 2);
    }
    public double getRadius() {
        return radius;
    }

    public double getHaight() {
        return height;
    }
}
