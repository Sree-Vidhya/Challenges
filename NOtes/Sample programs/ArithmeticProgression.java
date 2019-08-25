package com.myob;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input starting number");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Input number to increment by");
        int incrementBy = Integer.parseInt(scanner.nextLine());
        int val = start;
        for(int i=1;i<=20;i++) {
            System.out.println(start);
            start += incrementBy;
        }
    }
}
