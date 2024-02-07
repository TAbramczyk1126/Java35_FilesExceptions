package org.futureCollars.lesson6.task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class ReverseFileReader {

    public static void main(String[] args) {
        ReverseFileReader reader = new ReverseFileReader();
        reader.readAndDislplayReversed("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");
    }

    public void readAndDislplayReversed(String fileName) {
        Stack<String> lines = new Stack<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.push(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        while (!lines.isEmpty()) {
            System.out.println(lines.pop());
        }
    }
}
