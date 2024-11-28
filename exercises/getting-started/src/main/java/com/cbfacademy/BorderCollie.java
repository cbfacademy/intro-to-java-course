package main.java.com.cbfacademy;

public class BorderCollie extends Dog {
  
  public BorderCollie(int legs) {
    super();
    this.legs = legs;
  }

  @Override
  public void fetchBall() {
    System.out.println("Run around the sheep");
  }
}
