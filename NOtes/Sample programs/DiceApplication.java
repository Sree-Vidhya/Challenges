package com.myob;

import java.util.Random;
import java.util.Scanner;

public class DiceApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;

        for(int i=1;i<=6;i++) {
            System.out.println("Press enter to roll the dice");
            scanner.nextLine();
            int currentNum = random.nextInt(6) + 1;
            System.out.println("You rolled "+currentNum);
            total += currentNum;
        }
        if(total >= 20) {
            System.out.println("You win!!");
        } else {
            System.out.println("You loooooooooose!!!!");
        }
    }
}
