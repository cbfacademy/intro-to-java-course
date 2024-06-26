public class Car {

    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    // Create the getter methods that return the privae attributes of the Car 
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }
    public String getColour(){
        return colour;
    }

    public int getYear(){
        return year;
    }


    // Create the setter methods that will aloow us to modify the attributes
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDetails(){
        return make, model, colour, year;
    }
}