package com.cbfacademy.shapes;

public abstract class Shape {

    private String name;
    // Cnonstructor 
    protected Shape(String name) {
        this.name = name;
    }

      // No-argument constructor
      protected Shape() {
        this.name = "";
    }

    abstract double getArea();

    public String getName() {
        return this.name;
    }

// If you want to instantiate Shape in PaintTest without providing any arguments, you need to either:
    // 1. Add a no-argument constructor to Shape explicitly so that Java can use it implicitly when you instantiate Shape without arguments.
    // 2. Modify the instantiation in PaintTest to provide the necessary arguments (e.g., new Sphere("Sphere", 5.0)).

    
    
}
