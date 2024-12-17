
import java.io.PrintWriter;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 4040;

        // Use try-with-resources to manage Socket
        try (Socket socket = new Socket(serverAddress, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to the server.");
            
            // Send a message to the server
            String message = "Hello, Server! This is a message from the client.";
            out.println(message);
            System.out.println("Message sent: " + message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}