package org.futureCollars.lesson6.task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class ReadReversedFileContent {

    private static Stack<String> lines = new Stack<>();

    public static void main(String[] args) {
        readReversedFileContent("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");
    }

    public static void readReversedFileContent(String fileName) {
        readAndPushLines(fileName);
        displayReversedLines();
    }

    private static void readAndPushLines(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.push(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayReversedLines() {
        while (!lines.isEmpty()) {
            System.out.println(lines.pop());
        }
    }
}