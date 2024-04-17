package com.cbfacademy.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ShapeTest {

    static double cylinderRadius = 3d;
    static double cylinderHeight = 4d;
    static double rectangleLength = 5d;
    static double rectangleWidth = 4d;
    static double sphereRadius = 3d;
    static Shape[] shapeArray = {
            new Cylinder(cylinderRadius, cylinderHeight),
            new Rectangle(rectangleLength, rectangleWidth),
            new Sphere(sphereRadius)
    };

    private double delta = 0.01;

    @DisplayName("getArea() method calculates area correctly")
    @ParameterizedTest
    @MethodSource
    public void getArea_CalculatesAreaCorrectly(Shape shape, double expectedArea) {
        double calculatedArea = shape.getArea();

        assertEquals(expectedArea, calculatedArea, delta);
    }

    private static Stream<Arguments> getArea_CalculatesAreaCorrectly() {
        List<Arguments> searchArguments = new ArrayList<>();
        double area = 0;

        for (Shape shape : shapeArray) {
            switch (shape.getClass().getSimpleName()) {
                case "Cylinder":
                    area = cylinderHeight * Math.PI * Math.pow(cylinderRadius, 2);
                    break;
                case "Rectangle":
                    area = rectangleLength * rectangleWidth;
                    break;
                case "Sphere":
                    area = 4 * Math.PI * Math.pow(sphereRadius, 2);
                    break;
            }

            searchArguments.add(Arguments.of(shape, area));
        }

        return searchArguments.stream();
    }

    @ParameterizedTest
    @DisplayName("getName() method returns shape name")
    @MethodSource
    public void getName_ReturnsShapeName(Shape shape, String expectedName) {
        String shapeName = shape.getName();

        assertEquals(expectedName, shapeName);
    }

    private static Stream<Arguments> getName_ReturnsShapeName() {
        List<Arguments> searchArguments = new ArrayList<>();

        for (Shape shape : shapeArray) {
            searchArguments.add(Arguments.of(shape, shape.getClass().getSimpleName()));
        }

        return searchArguments.stream();
    }
}
