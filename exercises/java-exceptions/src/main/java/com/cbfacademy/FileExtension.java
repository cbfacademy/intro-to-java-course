package com.cbfacademy;

import java.util.List;
import java.util.ArrayList;

public class FileExtension {

    public static boolean check(String filename) throws FilenameException{

    if (filename.endsWith(".java")) {
        return true;
    } else if (filename == null) {
        throw new FilenameException("Please enter a non null value for filename");
    } else {
        return false;
    }
    
    }

    public static Map<String, int> map(List<String> filenames) {
        for (String filename: filenames) {
            boolean extensionValue = check(filename);

        }
      
    }
    
}
