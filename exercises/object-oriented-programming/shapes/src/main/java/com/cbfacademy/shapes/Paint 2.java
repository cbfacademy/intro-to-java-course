package com.cbfacademy.shapes;

public class Paint {
    protected double coverage; // represents the number of square feet per gallon this paint can coverage = getArea/Amount

    public Paint(double coverage){
        this.coverage = coverage;
    }
    
    // public double getCoverage(){
    //     return this.coverage;
    // }

    // public void setCoverage(double coverage){
    //     this.coverage = coverage;
    // }

    // This method will return the numer of gallons for a   given shape so amount = getArea/coverage
    public double getAmount(Shape shape){
        // get area of shape instance:
        double area = shape.getArea();
        double amount = area / this.coverage;
        return amount;
    }
}
