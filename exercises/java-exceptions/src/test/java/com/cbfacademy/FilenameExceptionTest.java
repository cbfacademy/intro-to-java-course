package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "FilenameException Test Suite")
public class FilenameExceptionTest {
    @Test
    @DisplayName(value = "Test FilenameException is a checked exception")
    void verifyFilenameExceptionIsCheckedException() {
        assertTrue(Exception.class.isAssignableFrom(FilenameException.class));
        assertFalse(RuntimeException.class.isAssignableFrom(FilenameException.class));
    }
}
