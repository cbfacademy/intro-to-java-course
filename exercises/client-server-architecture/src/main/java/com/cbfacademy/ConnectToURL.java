package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class ConnectToURL {
    public static void main(String[] args) throws Exception {
        try {
            // Instantiate the webpage you want to read from using URI
            URI uri = new URI("https://codingblackfemales.com/");
            // Convert the URI to URL - URI is needed as the URL(String) constructor is deprecated in Java 20. You should use URI to create a URL
            URL myurl = uri.toURL();
            // Establish a connection with the page - you can do rgular urlconn or httpconnection
            URLConnection myURLConnection  = myurl.openConnection(); 

            // We need to open an input stream: classes used for reading data, usually from files, network connections, or other input sources
            InputStreamReader reader = new InputStreamReader(myURLConnection.getInputStream());
            // Pass input stream reader to buffer reader which will read info from input streamer and store them in a temp storage (hence bufferr)
            BufferedReader buffer = new BufferedReader(reader);

            // Now print page contanet using a while loop
            String inputLine = ""; // initialise an empty string
            while (true) {
                inputLine =  buffer.readLine(); 
                if(inputLine!=null) {
                    System.out.println(inputLine);
                } else {
                    break;
                }
            }

        } catch (MalformedURLException mfe) {
            System.out.println("Malformed URL: " + mfe.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

    
}
