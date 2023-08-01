package com.cbfacademy.shapes;

/**
 * A program to compute the amount of paint needed to paint various shapes.
 */
public class PaintShapes {
    public static void main(String[] args) {
        Rectangle deck = new Rectangle(35, 20);
        Sphere ball = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        Paint paint = new Paint(350);
        double paintNeeded = 0;
        
        paintNeeded += paint.amount(deck);
        paintNeeded += paint.amount(ball);
        paintNeeded += paint.amount(tank);
        System.out.println("Overall amount of paint needed: " + String.format("%.2f", paintNeeded) + " gallons");
    }
}
