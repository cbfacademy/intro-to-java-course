import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class CodingBlackFemaleFetcher {
    public static void main(String[] args) {
        String urlString = "https://codingblackfemales.com";
        try {
             // Create a URI object from the URL string
             URI uri = new URI(urlString);

              // Convert the URI to a URL
            URL url = uri.toURL();

            // Open a stream and read content line by line
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}