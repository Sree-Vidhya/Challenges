package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the file name to create:");
        String filenName=scanner.nextLine();
        System.out.println("start writing the conent:");
        try {
            FileWriter filewriter=new FileWriter(filenName);
            while(true){
                String strToWrite= scanner.nextLine();
                if(strToWrite.isEmpty()==false){
                    filewriter.write(strToWrite);
                    filewriter.append('\n');
                }
                else{
                    filewriter.flush();
                    filewriter.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}