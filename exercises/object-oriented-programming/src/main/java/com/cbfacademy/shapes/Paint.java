package com.cbfacademy.shapes;

/**
 * A class representing paint with coverage information.
 */
public class Paint {
    private double coverage; // square feet per gallon of paint

    /**
     * Constructs paint with the given coverage.
     *
     * @param coverage The coverage in square feet per gallon.
     */
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    /**
     * Calculates the amount of paint (number of gallons) needed to paint a given shape.
     *
     * @param shape The shape to be painted.
     * @return The amount of paint needed in gallons.
     */
    public double amount(Shape shape) {
        double area = shape.area();
        
        return area / coverage;
    }
}
