package org.futureCollars.lesson6.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Data {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");
        Paths.get("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");

        writeToFile(file, "Kurs");
        writeToFile(file, "Java");
        writeToFile(file, "Lekcja 6");
        writeToFile(file, "Pliki");
        writeToFile(file, "Wyjątki");
        writeToFile(file, "Pliki");
        writeToFile(file, "Koniec pliku");

    }

    public static void writeToFile(File file, String text) throws IOException {

        String currentText = Files.readString(file.toPath());
        String newText = currentText + text + System.lineSeparator();
        Files.writeString(file.toPath(), newText);
    }
}
