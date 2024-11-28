package main.java.com.cbfacademy;

public class Cat extends Pet {
  String colour;

  public Cat (String colour) {
    this.colour = colour;
  }

  @Override
  public String makeSound() {
    return "Meooooooow";
  }
}
