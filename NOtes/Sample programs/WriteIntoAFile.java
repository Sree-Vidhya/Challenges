package com.myob;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteIntoAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to create");
        String fileName = scanner.nextLine();
        System.out.println("Start writing the file contents. " +
                "The file will be saved when you enter an empty line");
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            while(true) {
                String strToWrite = scanner.nextLine();
                if(strToWrite.isEmpty() == false) {
                    fileWriter.write(strToWrite);
                    fileWriter.append('\n');
                } else {
                    fileWriter.flush();
                    fileWriter.close();
                    break;
                }
            }

        } catch (IOException ioException) {
            System.err.println(ioException);
        }

    }
}
