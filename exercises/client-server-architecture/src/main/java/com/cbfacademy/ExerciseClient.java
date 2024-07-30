package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Scanner;

public class ExerciseClient {
    private static final String serveraddress = "localhost";
    private static final int serverPORT = OldServer.PORT;

    public static void main(String[] args) throws IOException {
        Socket socket = null; // crate the socket

        // now create a stream to read chaaracters from the server
        InputStreamReader inputstreamreader = null;
        // we also need to send messages to the server thus an output stream writer
        OutputStreamWriter outputstreamwriter = null;

        // now imporove the efficiency of the prgram by using a buffer reader whic will allow the reading of chunks of characters insetad of 1 by one to the disk
        BufferedReader bufferreader = null;

        // wrap the outputstreamwrite with bufferedwriter too
        BufferedWriter bufferedwriter = null;

        try {
            // Create the socket to connet to server
            socket = new Socket(serveraddress, serverPORT);

            // create the streamreader
            inputstreamreader = new InputStreamReader(socket.getInputStream());
            outputstreamwriter = new OutputStreamWriter(socket.getOutputStream());

            bufferreader = new BufferedReader(inputstreamreader);
            bufferedwriter = new BufferedWriter(outputstreamwriter);

            // create scanner to allow console inputs
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String messageFromClient = scanner.nextLine();  // returns a line of text that is read from the scanner object

                bufferedwriter.write(messageFromClient);
                bufferedwriter.newLine(); // adds line seperator for future messages 
                bufferedwriter.flush(); // flushes the stream when the buffer is full

                String serverResponse = bufferreader.readLine(); //
                System.out.println("Server Response: " + serverResponse);

                if (messageFromClient != null && messageFromClient.equalsIgnoreCase("BYE")) {
                    break; // stop the pconnectionif server says by regardless of case used
                }

            }

        } catch (IOException i) {
            i.printStackTrace(); // I/O excpetion also handles unknown host exception
        } finally { // ensure everhting is closed
            try {
                if (socket != null)
                socket.close();
                if (inputstreamreader != null)
                inputstreamreader.close();
                if (outputstreamwriter != null)
                outputstreamwriter.close();
                if (bufferedwriter != null)
                bufferedwriter.close();
                if (bufferreader != null)
                bufferreader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}

// Need to bother with getter & setters?