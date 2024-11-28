package main.java.com.cbfacademy;

public class App {
  public static void main(String[] arg) {
    Pet maverick = new Dog(4);
    Cat bell = new Cat("ginger");
    maverick.makeSound();
    bell.makeSound();
    maverick.eat();
    maverick.fetchBall();
    bell.eat();
  }
}