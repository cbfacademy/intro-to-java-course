package com.cbfacademy.shapes;

/**
 * A concrete class representing a Sphere, a descendant of Shape.
 */
public class Sphere extends Shape {
    private double radius;

    /**
     * Constructs a Sphere with the given radius.
     *
     * @param radius The radius of the sphere.
     */
    public Sphere(double radius) {
        this.shapeName = "Sphere";
        this.radius = radius;
    }

    /**
     * Calculates the area of the sphere using the formula (4 * π * (radius^2)).
     *
     * @return The area of the sphere.
     */
    @Override
    public double area() {
        return 4 * Math.PI * (radius * radius);
    }
}
