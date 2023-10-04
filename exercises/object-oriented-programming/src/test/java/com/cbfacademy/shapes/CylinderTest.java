package com.cbfacademy.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Cylinder Tests")
public class CylinderTest {

    private Cylinder cylinder;
    private double defaultRadius = 3d;
    private double defaultHeight = 4d;
    private double delta = 0.01;

    @BeforeEach
    void setUp() {
        cylinder = new Cylinder(defaultRadius, defaultHeight);
    }

    @Test
    @DisplayName("getArea() method calculates area correctly")
    public void getArea_CalculatesAreaCorrectly() {
        double expectedArea = defaultHeight * Math.PI * Math.pow(defaultRadius, 2);
        double calculatedArea = cylinder.getArea();

        assertEquals(expectedArea, calculatedArea, delta);
    }

    @Test
    @DisplayName("toString() method returns shape name")
    public void toString_ReturnsShapeName() {
        String expectedShapeName = "Cylinder";

        String shapeName = cylinder.toString();

        assertEquals(expectedShapeName, shapeName);
    }

    @Test
    @DisplayName("Cylinder class extends Shape")
    public void cylinder_ExtendsShape() {
        assertTrue(cylinder instanceof Shape, "Cylinder should extend the Shape class");
    }
}

