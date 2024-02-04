package org.futureCollars.lesson6.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataEvery2Line {

    public static void main(String[] args) {

    File file = new File("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    System.out.println(line);
                }
                lineNumber++;
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
