package com.cbfacademy.shapes;

/**
 * A concrete class representing a Rectangle, a descendant of Shape.
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructs a Rectangle with the given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.shapeName = "Rectangle";
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle using the formula (length * width).
     *
     * @return The area of the rectangle.
     */
    @Override
    public double area() {
        return length * width;
    }
}
