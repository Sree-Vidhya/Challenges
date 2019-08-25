package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//         /Users/sree.vidhya/Challenges/Java/src/Bank/src/com/company/input.csv
public class Fileiocsv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Try a sample file");
//            FileReader samplefile = new FileReader(scanner.nextLine());
//            BufferedReader readbuff = new BufferedReader(samplefile);
//            String myFileLines = null;
//            myFileLines = readbuff.readLine();
//            while (myFileLines!=null){
//                System.out.println(myFileLines);
//                myFileLines = readbuff.readLine();
//            }
//        } catch (FileNotFoundException e) {
////            e.printStackTrace();
//            System.out.println("Something went wrong program needs to close!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //-------------------------------------------------------------------------------------------------------------
//        try {
//            System.out.println("Try a sample file");
//            FileReader samplefile = new FileReader(scanner.nextLine());
//            Scanner filescanner = new Scanner(samplefile);
//            ArrayList<String> fileLines = new ArrayList<>();
//            String myFileLines = null;
//            while (filescanner.hasNext()){
//                myFileLines = filescanner.nextLine();
//                fileLines.add(myFileLines);
//            }
//            fileLines.forEach(s-> System.out.println(s));
//        } catch (FileNotFoundException e) {
//            System.out.println("Something went wrong program needs to close!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //-------------------------------------------------------------------------------------------------
        try {
            System.out.println("Try a sample file");
            FileReader samplefile = new FileReader(scanner.nextLine());
            Scanner filescanner = new Scanner(samplefile);
            ArrayList<String[]> fileContent = new ArrayList<>();
            String myFileLines = null;
            while (filescanner.hasNext()){
                myFileLines = filescanner.nextLine();
                fileContent.add(myFileLines.split(","));
            }
            fileContent.forEach(cells->{
                    for(String cell:cells) {
                System.out.println(cell + " ");
                    }
            System.out.println();
//                System.out.println(cells[0]);
            });
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong program needs to close!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
