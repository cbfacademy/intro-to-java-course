package main.java.com.cbfacademy;

public class Dog extends Pet {
  int legs;
  public Dog (int legs) {
    this.legs = legs;
  }

  @Override
  public String makeSound() {
    return "Woof";
  }

  public void fetchBall() {
    System.out.println("Run fast");
  }
}
