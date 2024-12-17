package cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
        int port = 4040;

        // Use try-with-resources to manage ServerSocket
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for clients...");

            // Accept a client connection
            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                System.out.println("Client connected.");
                
                // Read and print the message received
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}