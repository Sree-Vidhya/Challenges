package com.myob;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a Palindrome");
        String str = scanner.nextLine();

        StringBuffer sbuf = new StringBuffer(str);
        String reverse = sbuf.reverse().toString();

        if(str.equalsIgnoreCase(reverse)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
