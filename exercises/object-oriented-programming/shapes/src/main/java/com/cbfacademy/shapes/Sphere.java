package com.cbfacademy.shapes;

public class Sphere extends Shape {

    public double radius;

    public Sphere(double radius){
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return (4 * Math.PI* (this.radius*this.radius));
    }
    
    // @Override
    // public String getName(){
    //     return "Sphere";
    // }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
