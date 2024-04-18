package com.cbfacademy.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Paint Tests")
public class PaintTest {

    private Paint paint;
    private double delta = 0.01;

    @BeforeEach
    void setUp() {
        paint = new Paint(10.0);
    }

    @Test
    @DisplayName("getAmount() method calculates amount correctly")
    public void getAmount_CalculatesAmountCorrectly() {
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 50.0;
            }
        };
        double expectedAmount = 5.0;
        double calculatedAmount = paint.getAmount(shape);

        assertEquals(expectedAmount, calculatedAmount, delta);
    }
}

