package com.cbfacademy.shapes;

import java.util.List;

public class Shapes {
    public static double computeArea(List<Enclosure> shapes) {
        double totalArea = 0;
        for (Enclosure shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }

    public static double computePerimeter(List<Enclosure> shapes) {
        double totalPerimeter = 0;
        for (Enclosure shape : shapes) {
            totalPerimeter += shape.perimeter();
        }
        return totalPerimeter;
    }

    public static void main(String[] args) {
        // Creating shapes
        Square square1 = new Square(20);
        Square square2 = new Square(4);
        Square square3 = new Square(12);

        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(5);

        // Putting shapes in a list
        List<Enclosure> shapes = List.of(square1, square2, square3, circle1, circle2, circle3);

        // Computing results
        double totalArea = computeArea(shapes);
        double totalPerimeter = computePerimeter(shapes);

        System.out.println("Area for all shapes: " + totalArea);
        System.out.println("Perimeter for all shapes: " + totalPerimeter);
    }
}
