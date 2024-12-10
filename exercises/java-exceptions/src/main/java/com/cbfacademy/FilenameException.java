package com.cbfacademy;

public class FilenameException extends Exception {
    public FilenameException() {
        super();
    }
    //Constructor that accepts a message 
    public FilenameException(String message) {
        super(message);
    }
        // constructor that accepts both the message and ta cause
    public FilenameException(String message, Throwable cause) {
        super(message, cause);
        
    }
    public FilenameException(Throwable cause) {
        super(cause);
    }
}

