package com.cbfacademy;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class ExerciseServer {
    public static void main(String[] args) {
        //ServerSocket to listen on port4040
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server is listenting on port 4040...");

            //to wait for client to connect and create a Buffered Reader to read the client's input stream
            try (Socket clientSocket = serverSocket.accept();
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                System.out.println("Client connect.");

                //read the message sent by the client and print it to the console
                String message = input.readLine();
                System.out.println("Received message: " + message);
             }
        } catch (Exception e) {
            e.printStackTrace(); //prints any exceptions that occur
        }
    }

}
