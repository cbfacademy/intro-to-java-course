package com.cbfacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("FileManager Test Suite")
public class FileManagerTest {

    private FileManager fileManager;

    @BeforeEach
    void setUp() {
        fileManager = new FileManager();
    }

    @AfterEach
    void tearDown() {
        fileManager = null;
    }

    @Test
    @DisplayName("getReader() method can read file contents")
    void getReader_CanReadFileContents() throws IOException {
        // Prepare a test file
        Path testFile = createTempFileWithContent("testfile.txt", "Test content");

        try (BufferedReader reader = fileManager.getReader(testFile.toString())) {
            assertThat(reader, is(notNullValue()));
            String line = reader.readLine();
            assertThat(line, is(equalTo("Test content")));
        }
    }

    @Test
    @DisplayName("getReader() method throws IOException for non-existent file")
    void getReader_ThrowsIOExceptionForNonExistentFile() {
        // Attempt to read a nonexistent file
        assertThrows(IOException.class, () -> fileManager.getReader("nonexistent.txt"));
    }

    @Test
    @DisplayName("copy() method copies file content to new file correctly")
    void copy_CopiesFileContentToNewFileCorrectly() throws IOException {
        // Prepare a source file
        Path sourceFile = createTempFileWithContent("source.txt", "Source content");
        Path targetFile = getTemporaryFilePath("target.txt");

        // Copy the source file to a target file
        fileManager.copy(sourceFile.toString(), targetFile.toString());

        // Read the target file and verify its content
        assertThat(Files.exists(targetFile), is(true));
        assertThat(Files.readAllLines(targetFile), contains("Source content"));
    }

    @Test
    @DisplayName("copy() method overwrites existing file")
    void copy_OverwritesExistingFile() throws IOException {
        // Prepare source and target files with the same name
        Path sourceFile = createTempFileWithContent("overwrite_source.txt", "Source content");
        Path targetFile = createTempFileWithContent("overwrite_target.txt", "Target content");

        // Copy the source file to the target file, overwriting it
        fileManager.copy(sourceFile.toString(), targetFile.toString());

        // Read the target file and verify its content
        assertThat(Files.readAllLines(targetFile), contains("Source content"));
    }

    @Test
    @DisplayName("reverseLines() method copies reversed content to new file correctly")
    void reverseLines_CopiesReversedContentToNewFileCorrectly() throws IOException {
        // Prepare a source file with multiple lines
        Path sourceFile = createTempFileWithContent("source_lines.txt", "Line 1\nLine 2\nLine 3");
        Path targetFile = getTemporaryFilePath("target_lines.txt");

        // Reverse the lines and store in a target file
        fileManager.reverseLines(sourceFile.toString(), targetFile.toString());

        // Read the target file and verify its content
        assertThat(Files.exists(targetFile), is(true));
        assertThat(Files.readAllLines(targetFile), contains("Line 3", "Line 2", "Line 1"));
    }

    @Test
    @DisplayName("reverseLines() method copies empty content to new file correctly")
    void testReverseLinesEmptyFile() throws IOException {
        // Prepare an empty source file
        Path sourceFile = createTempFileWithContent("empty_source.txt", "");
        Path targetFile = createTempFileWithContent("empty_target.txt", "Hello world!");

        // Reverse the lines of the empty source file to a target file
        fileManager.reverseLines(sourceFile.toString(), targetFile.toString());

        // Read the target file and verify that it is also empty
        assertThat(Files.exists(targetFile), is(true));
        assertThat(Files.readAllLines(targetFile), is(empty()));
    }

    private Path createTempFileWithContent(String fileName, String content) throws IOException {
        Path filePath = getTemporaryFilePath(fileName);

        Files.write(filePath, content.getBytes());

        return filePath;
    }

    private Path getTemporaryFilePath(String fileName) {
        Path tempDir = tempDirPath.toAbsolutePath();
        Path filePath = tempDir.resolve(fileName);

        return filePath;
    }

    @TempDir
    static Path tempDirPath;
}
