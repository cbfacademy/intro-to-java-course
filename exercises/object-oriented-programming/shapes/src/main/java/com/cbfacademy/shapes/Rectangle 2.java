package com.cbfacademy.shapes;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }
    
    // @Override
    // public String getName(){
    //     return "Rectangle";
    // }
    
}
