package org.futureCollars.lesson6.task6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChangeToUpperCase {
    public static void main(String[] args) {

        String inputFilePath = "C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt";
        String outputFilePath = "C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\output.txt";

        convertToUpperCaseAndSave(inputFilePath, outputFilePath);
    }

    public static void convertToUpperCaseAndSave(String inputFilePath, String outputFilePath) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase();
                bufferedWriter.write(upperCaseLine);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("nie ma takiego pliku, sprawdź ścieżkę do pliku data.txt");
        }
    }
}
