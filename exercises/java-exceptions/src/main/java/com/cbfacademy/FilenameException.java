package com.cbfacademy;

// import java.util.List; 

public class FilenameException extends Exception {
    // We need to create a constructor that takes in the message that will display in console output when the exceptin is caught 
    public String message; 

    public FilenameException (String message) {
        super(message); // since tis excpetion si a child of excpetion, we can call Exception's class version of the constrctor 
    
    }


    
}
