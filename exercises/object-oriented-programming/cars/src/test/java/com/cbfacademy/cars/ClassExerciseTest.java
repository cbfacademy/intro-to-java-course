package com.cbfacademy.cars;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

public abstract class ClassExerciseTest {
    protected static Stream<Arguments> getCarArguments() {
        List<HashMap<String, Object>> cars = getCarValues();

        return cars.stream()
                .map(map -> {
                    String make = (String) map.get("make");
                    String model = (String) map.get("model");
                    String colour = (String) map.get("colour");
                    int year = (int) map.get("year");

                    // return Arguments.of(new Car(make, model, colour, year), make, model, colour, year);
                    return Arguments.of(new Car(make, model, colour, year), make, model, colour, year);



                });
    }

    protected static List<HashMap<String, Object>> getCarValues() {
        List<HashMap<String, Object>> cars = List.of(
                new HashMap<>() {
                    {
                        put("make", "Volvo");
                        put("model", "V40");
                        put("colour", "Blue");
                        put("year", 2012);
                    }
                },
                new HashMap<>() {
                    {
                        put("make", "Porsche");
                        put("model", "Panamera");
                        put("colour", "Red");
                        put("year", 2009);
                    }
                },
                new HashMap<>() {
                    {
                        put("make", "Audi");
                        put("model", "A3");
                        put("colour", "Grey");
                        put("year", 2018);
                    }
                });
        return cars;
    }
}
