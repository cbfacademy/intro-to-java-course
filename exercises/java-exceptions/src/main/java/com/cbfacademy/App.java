package com.cbfacademy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<String> fileNames = Arrays.asList("App.java", "App.txt", null, "App.md");
        FileExtension fileExtension = new FileExtension();
        Map<String, Integer> resultMap = fileExtension.map(fileNames);

        // Print the result map
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("File: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
