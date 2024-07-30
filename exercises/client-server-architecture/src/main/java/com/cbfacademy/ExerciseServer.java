package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    private static ServerSocket serverSocket;
    public static final int PORT = 4040;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(PORT);
        System.out.println("Server is listening on port " + PORT);

        try {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    while (true) { 
                        String clientMessage = bufferedReader.readLine();
                        System.out.println("Message from client: " + clientMessage);
    
                        // Echo back to client
                        bufferedWriter.write("Server received: " + clientMessage);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();   
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } // YOU COULD USE A TRY WITH REOSURCES BLOCK TO ELIMINATE USING A FINALLY BLOCK 
    }
}

// if you want to run multiple clients - put another while loop but in practice- you will introduce multiple threads
