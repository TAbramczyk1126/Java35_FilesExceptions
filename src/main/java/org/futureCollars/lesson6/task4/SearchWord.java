package org.futureCollars.lesson6.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchWord {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt");
        String filePath = "C:\\Tomek\\JAVA\\Java35_FilesExceptions\\src\\main\\resources\\data.txt";

        findSearchedWord(filePath, "Plik");

    }

    public static void findSearchedWord(String filePath, String searchedWord) throws IOException {
        System.out.println(filePath);

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String textLine;

            while ((textLine = bufferedReader.readLine()) != null) {
                if (textLine.contains(searchedWord)) {
                    System.out.println("Znaleziono słowo \"" + searchedWord);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
