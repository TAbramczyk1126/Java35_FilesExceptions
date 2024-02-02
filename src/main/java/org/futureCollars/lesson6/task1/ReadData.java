package org.futureCollars.lesson6.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadData {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");
        Paths.get("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");

        System.out.println(Files.readString(file.toPath()));
    }
}
