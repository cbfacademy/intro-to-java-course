package com.cbfacademy;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

/**
 * This class implements java Socket server
 * @author hafsa!
 *
 */

// Create a simple program with two classes:
// a ExerciseServer class which uses a ServerSocket to listen for connections on localhost:4040, then prints message it receives on the screen.
// Ensure to release all resources at the end of your program.

public class OldServer {
    private static ServerSocket serverSocket; // intitlaise the server socket that will create the sockets to allow the client to estbalish a connection with the server
    public static final int PORT = 4040; // intitialise the port number to target connection from client to server

    public static void main(String[] args) throws IOException {
        try {
            // create the socket server object to listen on localhost:4040
            serverSocket = new ServerSocket(PORT); 
            System.out.println("Server is listening on port " + PORT);

            // Initialise the socket to wait & accept client connections using a while loop:
            while (true) { // ensures that the server is always listening for new connections and creares new sockets for each new client 
                // after this, read data sent from socket using input streamer
                try (Socket socket = serverSocket.accept()) {
                    // after this, read data sent from the socket using data input streamer
                    DataInputStream inputStream = new DataInputStream(socket.getInputStream()); // the data input stream will help read the data sent through the socket
                    String message = inputStream.readUTF();
                    
                    System.out.println("Message from client: " + message);

                    // Close the client socket
                    socket.close();
                } 
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    
}

// Notes:
// sudo lsof -i :4040 : will processes using a specific port (e.g., 4040)
// to kill a process sudo kill -9

