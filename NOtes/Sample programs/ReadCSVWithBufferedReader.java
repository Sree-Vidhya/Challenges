package com.myob;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSVWithBufferedReader {
    public static void main(String[] args) {
        //   /Users/lavanyas/Downloads/pima-indians-diabetes.csv
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to read");
        try {
            FileReader fileReader = new FileReader(scanner.nextLine());
            BufferedReader bufReader = new BufferedReader(fileReader);
            ArrayList<String[]> fileContent = new ArrayList<>();

            String linesInFile = bufReader.readLine();
            while(linesInFile != null) {
                System.out.println(linesInFile);
                fileContent.add(linesInFile.split(","));
                linesInFile = bufReader.readLine();
            }

            fileContent.forEach(cells->{
                for(String cell:cells) {
                    System.out.print(cell+" ");
                }
                System.out.println();
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
