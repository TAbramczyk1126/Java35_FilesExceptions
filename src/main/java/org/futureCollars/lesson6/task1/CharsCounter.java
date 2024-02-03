package org.futureCollars.lesson6.task1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharsCounter {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");

        try {
            int totalCharCount = countTotalCharsInFile(file.toPath());
            System.out.println("The total number of characters in the file is: " + totalCharCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countTotalCharsInFile(Path path) throws IOException {
        String content = Files.readString(path, StandardCharsets.UTF_8);
        return content.length();
    }
}
