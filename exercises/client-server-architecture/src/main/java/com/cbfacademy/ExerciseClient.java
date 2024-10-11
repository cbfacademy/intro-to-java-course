package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.*;


public class ExerciseClient {
    public static void main(String[] args) {
        String urlString = "https://codingblackfemales.com/";

        try {
            //create a URL object representing the web address
            URL url = new URL(urlString);

            // open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Use try-width-resources to ensure the BufferedReader is closed automaticall
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                // Read and print each line of the web page's content
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // print any exceptions that occur
        }
    }
}
        