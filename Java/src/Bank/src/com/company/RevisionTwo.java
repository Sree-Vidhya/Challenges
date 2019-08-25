package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.IntBinaryOperator;

public class RevisionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a input from 10 -20");
//        int num = Integer.parseInt(input.nextLine());
//        String value= null;
//        int key = 1;
//        HashMap<Integer, String>hashMap = new HashMap<>();
//        if(num > 10 && num < 20){
//            while(key <= num) {
//                value = Integer.toBinaryString(key);
//                hashMap.put(key,value);
//                key++;
//            }
//            hashMap.forEach((s,t)->{
//                System.out.println(s + "    "+ t);
//            });
//
//        }
        //-----------------------------------------------------------------------------------------------
        TreeMap<String,char[]> treeMap = new TreeMap<>();
        String reply = "Y";
        do{
            System.out.println("Enter a String");
            String key = input.nextLine();
            char[]stringToCharArray = key.toCharArray();
            treeMap.put(key,stringToCharArray);
            System.out.println("Do u want to continue?");
            reply= input.nextLine();
        }while(reply.equalsIgnoreCase("Y"));


//        for(String output:treeMap.keySet()){
//            System.out.println(output + treeMap.get(output));
//        }
        treeMap.forEach((key,output)->{
            System.out.print(key);
            for(char ch:output){
                System.out.print("  "+ch);
            };
            System.out.println();
        });

//------------------------------------------------------------------------------------------------------------

    }

}
