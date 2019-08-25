package com.company;

import java.util.Scanner;
import java.io.FileWriter;

public class FileWriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file");
        String fileName = scanner.nextLine();
        System.out.println("Start writing");
        try{
        FileWriter fileWriter = new FileWriter(fileName);
        while(true){
            String strToWrite = scanner.nextLine();
            if(strToWrite.isEmpty() == false) {
                fileWriter.write(strToWrite);
                fileWriter.append('/n');
            }
            else{
                fileWriter.flush();
                fileWriter.close();
            }
            }
        }
    }

}
