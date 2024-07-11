package com.cbfacademy;

import java.util.*;

public class FileExtension {

    public static boolean check(String filename) throws FilenameException{
        // You need to check if the filename is null or emprty before calling the method or checkign what the file extension of the file is
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Please enter a non null value for filename");
        } else if (filename.endsWith(".java")) {
            return true;
        } else {
            return false;
        }
    }

    public static Map<String, Integer> map(List<String> filenames) throws FilenameException {
        Map<String, Integer> filenamesMap = new HashMap<>();
        for (String filename: filenames) {  
            if (filename == null || filename.isEmpty()) {
                filenamesMap.put(filename, -1);   
            } else if (filename.endsWith(".java")) {
                filenamesMap.put(filename, 1);
            } else if (!filename.endsWith(".java")) {
                filenamesMap.put(filename, 0);   
            } 
        }
        return filenamesMap;
    }
    
}
