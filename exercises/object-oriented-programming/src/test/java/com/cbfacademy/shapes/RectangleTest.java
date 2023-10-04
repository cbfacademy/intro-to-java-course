package com.cbfacademy.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Rectangle Tests")
public class RectangleTest {

    private Rectangle rectangle;
    private double defaultLength = 5d;
    private double defaultWidth = 4d;
    private double delta = 0.01;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(defaultLength, defaultWidth);
    }

    @Test
    @DisplayName("getArea() method calculates area correctly")
    public void getArea_CalculatesAreaCorrectly() {
        double expectedArea = defaultLength * defaultWidth;
        double calculatedArea = rectangle.getArea();

        assertEquals(expectedArea, calculatedArea, delta);
    }

    @Test
    @DisplayName("toString() method returns shape name")
    public void toString_ReturnsShapeName() {
        String expectedShapeName = "Rectangle";
        String shapeName = rectangle.toString();

        assertEquals(expectedShapeName, shapeName);
    }

    @Test
    @DisplayName("Rectangle class extends Shape")
    public void rectangle_ExtendsShape() {
        assertTrue(rectangle instanceof Shape, "Rectangle should extend the Shape class");
    }
}
