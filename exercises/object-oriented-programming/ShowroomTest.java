package com.cbfacademy.cars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName(value = "Showroom tests")
public class ShowroomTest extends ClassExerciseTest {

    @Test
    @DisplayName("Showroom object has a valid getCars method")
    public void testShowroomObjectHasValidListMethod() {
        List<HashMap<String, Object>> carValues = getCarValues();
        List<Car> cars = new Showroom().getCars();

        for (HashMap<String, Object> expected : carValues) {
            assertTrue(hasMatch(cars, expected));
        }
    }

    private static boolean hasMatch(List<Car> cars, HashMap<String, Object> map) {
        for (Car car : cars) {
            boolean match = true;
            String make = (String) map.get("make");

            if (make != null && !car.getMake().equals(make)) {
                match = false;
            }

            String model = (String) map.get("model");

            if (model != null && !car.getModel().equals(model)) {
                match = false;
            }

            String colour = (String) map.get("colour");

            if (colour != null && !car.getColour().equalsIgnoreCase(colour)) {
                match = false;
            }

            Integer year = (Integer) map.get("year");

            if (year != null && car.getYear() != year) {
                match = false;
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}
