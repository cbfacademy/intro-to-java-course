package com.cbfacademy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("FileManager Test Suite")
public class FileManagerTest {

    private static String inputString;

    private FileManager fileManager;

    @BeforeAll
    static void setUpSuite() {
        // Define the path to the embedded text file (relative to the Maven resources
        // directory)
        String filePath = "exercise.txt";

        // Load the text file as an InputStream
        InputStream inputStream = FileManagerTest.class.getClassLoader().getResourceAsStream(filePath);

        if (inputStream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                // Read the entire contents of the file into a String
                inputString = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Resource not found: " + filePath);
        }
    }

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
        Path testFile = createTempFileWithContent("testfile.txt", inputString);

        try (BufferedReader reader = fileManager.getReader(testFile.toString())) {
            assertThat(reader, is(notNullValue()));

            String content = reader.lines().collect(Collectors.joining(System.lineSeparator()));

            assertThat(content, is(equalTo(inputString)));
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
        Path sourceFile = createTempFileWithContent("source.txt", inputString);
        Path targetFile = getTemporaryFilePath("target.txt");

        // Copy the source file to a target file
        fileManager.copy(sourceFile.toString(), targetFile.toString());

        // Read the target file and verify its content
        assertThat(Files.exists(targetFile), is(true));
        assertThat(Files.readString(targetFile), is(equalTo(inputString)));
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
        Path sourceFile = createTempFileWithContent("source_lines.txt", inputString);
        Path targetFile = getTemporaryFilePath("target_lines.txt");
        StringBuilder reversedTextBuilder = new StringBuilder();

        // Split the input string into individual lines
        String[] lines = inputString.split("\n");

        // Reverse the order of the lines
        for (int i = lines.length - 1; i >= 0; i--) {
            reversedTextBuilder.append(lines[i]);

            if (i > 0) {
                reversedTextBuilder.append("\n"); // Add a newline if it's not the last line
            }
        }

        // Reconstruct the reversed multiline string
        String reversedText = reversedTextBuilder.toString();

        // Reverse the lines and store in a target file
        fileManager.reverseLines(sourceFile.toString(), targetFile.toString());

        // Read the target file and verify its content
        assertThat(Files.exists(targetFile), is(true));
        assertThat(Files.readString(targetFile), startsWith(reversedText));
    }

    @Test
    @DisplayName("reverseLines() method copies empty content to new file correctly")
    void reverseLines_CopiesEmptyContentToNewFile() throws IOException {
        // Prepare an empty source file
        Path sourceFile = createTempFileWithContent("empty_source.txt", "");
        Path targetFile = createTempFileWithContent("empty_target.txt", inputString);

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
