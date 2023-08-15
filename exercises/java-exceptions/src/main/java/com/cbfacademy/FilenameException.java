package com.cbfacademy;

/**
 * Represents an exception encountered when a filename isn't in the expected format.
 */
public class FilenameException extends Exception {
    public FilenameException(String message) {
        super(message);
    }
}
