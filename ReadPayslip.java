package com.myob;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// /Users/sree.vidhya/Challenges/Payslip/employee
public class ReadPayslip {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i =0;
        int j =0;
        try {
            System.out.println("Try a sample file");
//            FileReader samplefile = new FileReader(input.nextLine());
            FileReader samplefile = new FileReader("/Users/sree.vidhya/Challenges/Payslip/employee");
            Scanner filescanner = new Scanner(samplefile);
            List<String> fileContent = new ArrayList<>();
            String myFileLines = null;
            while (filescanner.hasNext()) {
                myFileLines = filescanner.nextLine();
                fileContent.add(myFileLines);
            }
            //----------------------------------EXECUTING BUT LAST LINE GIVES ERROR-----------------------------------------------------------------------------------------------------
//            do {
//                System.out.println("Name:           " + fileContent.get(i));
//                System.out.println("Payperiod:      " + fileContent.get(i = i + 1));
//                System.out.println("Gross Income:   " + fileContent.get(i = i + 1));
//                System.out.println("Income tax:     " + fileContent.get(i = i + 1));
//                System.out.println("Net Income:     " + fileContent.get(i = i + 1));
//                System.out.println("Super:          " + fileContent.get(i = i + 1));
//                System.out.println();
//                i++;
//            } while (!(fileContent.isEmpty()));
            //----------------------------------------FOR EACH NOT WORKING-----------------------------------------------------------------------------------------------------------------
//            for (String data : fileContent) {
//                System.out.println(data);
//                System.out.println();
//                System.out.println(data);
//            }
            //--------------------------------------------------FOR LOOP is working :)------------------------------------------------------------------------------------------------------
            for( i=0;i<fileContent.size();i++){
                System.out.println("Name:           " + fileContent.get(i));
                System.out.println("Payperiod:      " + fileContent.get(++i));
                System.out.println("Gross Income:   " + fileContent.get(++i));
                System.out.println("Income tax:     " + fileContent.get(++i));
                System.out.println("Net Income:     " + fileContent.get(++i));
                System.out.println("Super:          " + fileContent.get(++i));
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong program needs to close!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
