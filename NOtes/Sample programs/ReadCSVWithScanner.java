package com.myob;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSVWithScanner {
        public static void main(String[] args) {
            //   /Users/lavanyas/Downloads/pima-indians-diabetes.csv
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the file you want to read");
            try {
                FileInputStream fis = new FileInputStream(scanner.nextLine());
                Scanner fileScanner = new Scanner(fis);
                ArrayList<String[]> fileContent = new ArrayList<>();

                String linesInFile = null;

                while(fileScanner.hasNext()) {
                    linesInFile = fileScanner.nextLine();
                    fileContent.add(linesInFile.split(","));
                }

                fileContent.forEach(cells->{
                    for(String cell:cells) {
                        System.out.print(cell+" ");
                    }
                    System.out.println();
                });

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
