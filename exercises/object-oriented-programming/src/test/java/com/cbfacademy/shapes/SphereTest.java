package com.cbfacademy.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Sphere Tests")
public class SphereTest {

    private Sphere sphere;
    private double defaultRadius = 3d;
    private double delta = 0.01;

    @BeforeEach
    void setUp() {
        sphere = new Sphere(defaultRadius);
    }

    @Test
    @DisplayName("getArea() method calculates area correctly")
    public void getArea_CalculatesAreaCorrectly() {
        double expectedArea = 4 * Math.PI * Math.pow(defaultRadius, 2);
        double calculatedArea = sphere.getArea();

        assertEquals(expectedArea, calculatedArea, delta);
    }

    @Test
    @DisplayName("toString() method returns shape name")
    public void toString_ReturnsShapeName() {
        String expectedShapeName = "Sphere";
        String shapeName = sphere.toString();

        assertEquals(expectedShapeName, shapeName);
    }

    @Test
    @DisplayName("Sphere class extends Shape")
    public void sphere_ExtendsShape() {
        assertTrue(sphere instanceof Shape, "Sphere should extend the Shape class");
    }
}

