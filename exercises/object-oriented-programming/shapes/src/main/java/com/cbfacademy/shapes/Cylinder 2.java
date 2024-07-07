package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    public double radius;
    public double height;

    public Cylinder(double radius, double height){
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return (this.height * Math.PI* (this.radius*this.radius));
    }
    
//     @Override
//     public String getName(){
//         return "Cylinder";
//     }
}

    
