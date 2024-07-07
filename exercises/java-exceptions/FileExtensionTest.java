package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName(value = "FileExtension Test Suite")
public class FileExtensionTest {
    private FileExtension fileExtension;

    @BeforeEach
    void setUp() {
        fileExtension = new FileExtension();
    }

    @ParameterizedTest
    @DisplayName(value = "test the check method returns the expected result for the given filename")
    @CsvSource({
            "file.txt, false",
            "file.jav, false",
            "file.java, true",
            "file.javac, false",
            "file., false",
            "java.txt, false",
            "java, false",
            ".java, true"
    })
    void testCheckMethodReturnsExpectedResult(String fileName, boolean expectedResult) throws FilenameException {
        boolean result = fileExtension.check(fileName);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName(value = "test the check method throws a FilenameException when the filename is null or an empty string")
    void testCheckMethodThrowsFilenameExceptionForNullOrEmpty() {
        assertThrows(FilenameException.class, () -> fileExtension.check(null));
        assertThrows(FilenameException.class, () -> fileExtension.check(""));
    }

    @Test
    @DisplayName(value = "test the map method returns an empty Map when given an empty list of filenames")
    void testMapMethodReturnsEmptyMapForEmptyList() {
        List<String> fileNames = Collections.emptyList();
        Map<String, Integer> resultMap = fileExtension.map(fileNames);
        assertTrue(resultMap.isEmpty());
    }

    @Test
    @DisplayName(value = "test the map method returns a Map of expected values")
    void testMapMethodReturnsExpectedMapForMixedList() {
        List<String> fileNames = Arrays.asList("file1.java", "file2.txt", "file3.java", null, "");

        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("file1.java", 1);
        expectedMap.put("file2.txt", 0);
        expectedMap.put("file3.java", 1);
        expectedMap.put(null, -1);
        expectedMap.put("", -1);

        Map<String, Integer> resultMap = fileExtension.map(fileNames);
        assertEquals(expectedMap, resultMap);
    }
}
