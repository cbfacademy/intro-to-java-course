package cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLReaderExample {
    public static void main(String[] args) {
        // URL to connect to
        String urlString = "https://codingblackfemales.com";

        try {
            // Create a URL object
            URL url = new URL("https://codingblackfemales.com/");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Read the content using BufferedReader
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred while reading from the URL:");
            e.printStackTrace();
        }
    }
}