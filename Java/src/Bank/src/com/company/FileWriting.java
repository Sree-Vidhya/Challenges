package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWriting {
    ///    /Users/sree.vidhya/Challenges/Java/src/Bank/sree
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Employee> listEmployee = new TreeMap<>();
//        System.out.println("enter the file name to create:");
//        String fileName = scanner.nextLine();
//        boolean loopForever = true;
//        while (loopForever) {
//            //                FileWriter filewriter = new FileWriter(fileName);
////                System.out.println("\n");
//
//            System.out.println("Enter a employee firstname");
//            String firstName = scanner.nextLine();
//
//            System.out.println("Enter a employee lastname");
//            String lastName = scanner.nextLine();
//
//            System.out.println("Enter employee salary");
//
//            double salary = Double.parseDouble(scanner.nextLine());
//
//            Employee emp = new Employee(firstName, lastName, salary);
//            listEmployee.put(emp.getEmpCode(), emp);
//            System.out.println("Do you want to continue?");
//            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
//
////            listEmployee.forEach((empCode, emp) -> {
////                System.out.printf("%s - %s", empCode, emp, "\n");
////            });
//        }
//            try {
//                FileWriter filewriter=new FileWriter(fileName);
//                while(true){
//                    String strToWrite= scanner.nextLine();
//                    if(strToWrite.isEmpty()==false){
//                        filewriter.write(strToWrite);
//                        filewriter.append('\n');
//                    }
//                    else{
//                        filewriter.flush();
//                        filewriter.close();
//                        break;
//                    }
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        try {
            System.out.println("Try a sample file");
            FileReader samplefile = new FileReader(scanner.nextLine());
            Scanner filescanner = new Scanner(samplefile);
            TreeMap<String,Employee> treeMap= new TreeMap<>();
            String[] myFileLines = null;
            while (filescanner.hasNext()){
                String[]fileLineArr = filescanner.nextLine().split(",");
                String firstName = fileLineArr[0];
                String lastName = fileLineArr[1];
                String salary = fileLineArr[2];
                Employee emp = new Employee(firstName,lastName,Double.parseDouble(salary));
                treeMap.put(emp.getEmpCode(),emp);
                     System.out.println(emp);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong program needs to close!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
