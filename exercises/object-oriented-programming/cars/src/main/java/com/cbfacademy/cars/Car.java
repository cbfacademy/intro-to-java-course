public class Car {
   
  private String make;
  private String model;
  private String colour;
  private int year;

  public Car(String make, String model, String colour, int year) {

  this.make= make;
  this.model = model;
  this.colour = colour;
  this.year = year;
  }

  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public String getColour() {
    return this.colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getDetails() {
    return "Make: " + this.make + ", Model: " + this.model + ", Colour: " + this.colour + ", Year: " + this.year;
  }
}
