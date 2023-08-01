package com.cbfacademy.shapes;

/**
 * A concrete class representing a Cylinder, a descendant of Shape.
 */
public class Cylinder extends Shape {
    private double radius;
    private double height;

    /**
     * Constructs a Cylinder with the given radius and height.
     *
     * @param radius The radius of the cylinder's base.
     * @param height The height of the cylinder.
     */
    public Cylinder(double radius, double height) {
        this.shapeName = "Cylinder";
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates the area of the cylinder using the formula (height * π * (radius^2)).
     *
     * @return The area of the cylinder.
     */
    @Override
    public double area() {
        return height * Math.PI * (radius * radius);
    }
}
