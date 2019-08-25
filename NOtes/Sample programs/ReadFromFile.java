package com.myob;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

        public static void main(String[] args) {
            //   /Users/lavanyas/mynew/api/server.js
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the file you want to read");
            try {
                FileReader fileReader = new FileReader(scanner.nextLine());
                BufferedReader bufReader = new BufferedReader(fileReader);

                String linesInFile = bufReader.readLine();
                while(linesInFile != null) {
                    System.out.println(linesInFile);
                    linesInFile = bufReader.readLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            } catch (IOException e) {
                System.out.println("Something went wrong while reading the file!");
            }
        }
    }
