package com.myob;

import java.util.Scanner;

public class CheckPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reply = "n";
        do {
            System.out.println("Input a number");
            int num = scanner.nextInt();
            double root = Math.sqrt(num);
            if (root == Math.round(root)) {
                System.out.println("Perfect square");
            } else {
                System.out.println("Not a perfect square");
            }
            System.out.println("Do you want to input more numbers?");
            reply = scanner.nextLine();
        } while(reply.equalsIgnoreCase("y"));
    }
}
