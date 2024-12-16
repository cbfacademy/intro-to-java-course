package com;

import java.io.PrintWriter;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 4040;

        try (Socket socket = new Socket(hostname, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            String message = "Hello, ExerciseServer!";
            writer.println(message);
            System.out.println("Message sent: " + message);

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
