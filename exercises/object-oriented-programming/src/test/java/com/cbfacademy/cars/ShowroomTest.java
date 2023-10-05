package com.cbfacademy.cars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName(value = "Showroom tests")
public class ShowroomTest {

    @Test
    @DisplayName("Showroom object has a valid getCars method")
    public void testShowroomObjectHasValidListMethod() {
        List<HashMap<String, Object>> carValues = getCarValues();
        List<Car> cars = new Showroom().getCars();

        for (HashMap<String, Object> expected : carValues) {
            assertTrue(hasMatch(cars, expected));
        }
    }

    private static List<HashMap<String, Object>> getCarValues() {
        List<HashMap<String, Object>> cars = List.of(
                new HashMap<>() {
                    {
                        put("make", "Volvo");
                        put("model", "V40");
                        put("year", 2012);
                    }
                },
                new HashMap<>() {
                    {
                        put("make", "Porsche");
                        put("model", "Panamera");
                        put("year", 2009);
                    }
                },
                new HashMap<>() {
                    {
                        put("make", "Audi");
                        put("model", "A3");
                        put("year", 2018);
                    }
                });
        return cars;
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
