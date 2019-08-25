package com.myob;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFileWithScanner {
    public static void main(String[] args) {
        //   /Users/lavanyas/Downloads/reviews_Electronics_5.json
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to read");
        try {
            FileInputStream fis = new FileInputStream(scanner.nextLine());
            Scanner fileScanner = new Scanner(fis);
            ArrayList<String> fileLines = new ArrayList<>();
            String linesInFile = null;

            while(fileScanner.hasNext()) {
                linesInFile = fileScanner.nextLine();
                fileLines.add(linesInFile);
            }

            fileLines.forEach(System.out::println);
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
