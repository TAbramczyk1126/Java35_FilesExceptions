package org.futureCollars.lesson6.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadData {

    public static void main(String[] args) {

        Path filePath = Paths.get("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");

        try {
            System.out.println(Files.readString(filePath));
        }
        catch (IOException e) {
            System.out.println("There was an error while reading file: " + e.getMessage());
        }
        System.out.println("End program");
    }
}
