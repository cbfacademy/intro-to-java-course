package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
    System.out.println( "Hello World!" );

    double number1 = 0.4;
    double number2 = 0.8;
    float number3 = 2f;
    float number4 = 5f;
    int number5 = 12;
    int number6 = 12;

    double sumDouble = number1 + number2;
    float sumFloat = number3 + number4;

    double subtractDouble = number1 - number2;
    float subtractFloat = number3 - number4;

    double divideDouble = number1/number2;
    float divideFloat = number3/number4;

    double multiplyDouble = number1 * number2;
    float multiplyFloat = number3 * number4;

     System.out.println(sumDouble);
     System.out.println(sumFloat);
     System.out.println(subtractDouble);
     System.out.println(subtractFloat);
     System.out.println(divideDouble);
     System.out.println(divideFloat);
     System.out.println(multiplyDouble);
     System.out.println(multiplyFloat);
     System.out.println(number1 == number2);
     System.out.println(number1 < number2);
     System.out.println(number1 > number2);
     System.out.println(number5++);
     System.out.println(++number6);
     
    }
}
