package com.myob;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println(0);
            System.exit(0);
        } else {
            int[] iArr = new int[num];

            iArr[0] = 0;
            iArr[1] = 1;
            for (int i = 2; i < num; i++) {
                iArr[i] = iArr[i - 1] + iArr[i - 2];
            }

            for (int i : iArr) {
                System.out.println(i);
            }
        }
    }
}
