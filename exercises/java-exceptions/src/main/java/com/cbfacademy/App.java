package com.cbfacademy;

import java.util.*;


public class App {   

    public static void main( String[] args ){ 
        FileExtension fileExtensionInstance = new FileExtension();
        List<String> filenames = Arrays.asList("App.java", "App.txt", null, "App.md");
        System.out.println("Testsing the Check method:");
        for (String filename:filenames){
            try {
                boolean result = fileExtensionInstance.check(filename);
                System.out.println("Filename: " + filename + ", Result: " + result);

            } catch (FilenameException fe) {
                System.out.println("Filename: " + filename + ", Exception: " + fe.getMessage());
            }

        }

        System.out.println("Testsing the Map method:");
        try {
            Map<String, Integer> resultsMap = fileExtensionInstance.map(filenames);
            for (Map.Entry<String, Integer> entry : resultsMap.entrySet()) {
                System.out.println("Filename: " + entry.getKey() + ", Result: " + entry.getValue());
            }
            System.out.println("Complete map: " + resultsMap);
            // OR: for (Integer value : map.values()) {System.out.println(value); }
        } catch (FilenameException fe) {
            System.out.println("Exception: " + fe.getMessage());

        }


    }

    // Testsing the Check method:
    // Filename: App.java, Result: true
    // Filename: App.txt, Result: false
    // Filename: null, Exception: Please enter a non null value for filename
    // Filename: App.md, Result: false
    // Testsing the Map method:
    // Filename: null, Result: -1
    // Filename: App.java, Result: 1
    // Filename: App.txt, Result: 0
    // Filename: App.md, Result: 0
    // Complete map: {null=-1, App.java=1, App.txt=0, App.md=0}


}


// compile:avac -d target/classes src/main/java/com/cbfacademy/App.java
// run: java -cp target/classes com.cbfacademy.App
