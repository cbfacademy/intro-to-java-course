package com.cbfacademy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
// methods 
public boolean check(String filename) throws FilenameException {
    // check if filename is empty or null
    if (filename == null || filename.isEmpty()) {
        throw new FilenameException("filename cannot be null or empty");
    }
    //Return true if file has a ".java extension", otherwise false
    return filename.endsWith(".java");
}
// Method to map filenames to 1 (if it's .java file), 0 (if it's not), or -1 (if an except occurs)
public Map<String, Integer> map(List<String> filenames) {
    // Initialize a map to store the filename and corresponding value
    Map<String, Integer> hm = new HashMap<>();

// Iterate through the list of filenames
for (String filename : filenames) {
    try {
        // Check if the filename is valid and map it
        Integer isJava = check(filename) ? 1 : 0;
        // This may throw a FilenameException
        hm.put(filename, isJava);
    } catch (FilenameException fe) {
         // Handle the exception and map -1 for invalid filenames
         hm.put(filename, -1);
    }
}
// Return the map with the file names and their corresponding values
return hm;
}

// Main method for testing
public static void main(String[] args) {
    FileExtension fileExtension = new FileExtension();
    List<String> filenames = List.of("App.java", "App.txt", null, "App.md");

    // Call the map method and print the result
    Map<String, Integer> result = fileExtension.map(filenames);
    System.out.println(result);
}
}   