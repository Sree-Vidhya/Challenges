package Game;

import javax.swing.event.TreeWillExpandListener;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TTT RC = new TTT();
        while (RC.reply.equalsIgnoreCase("y")) {
            if(RC.playerArr.size() == 0) {
                RC.arr = TTT.ResetMthd();
            }
            int computerInput = ThreadLocalRandom.current().nextInt(RC.min, RC.max + 1);
            System.out.println("Computer input: " + computerInput);
            System.out.println("Please enter the number to play tic tac toe");
            int playerInput = Integer.parseInt(scanner.nextLine());
            if ((RC.playerArr.contains(playerInput) || RC.computerArr.contains(playerInput))) {
                System.out.println("Player input not valid");
                System.out.println("User value " + RC.playerArr);
                System.out.println("Computer   " + RC.computerArr);
                ++RC.invalidInputs;
                continue;
            } else if (computerInput == playerInput) {
                System.out.println("Try again!!");
                ++RC.invalidInputs;
                continue;
            } else if (RC.playerArr.contains(computerInput) || RC.computerArr.contains(computerInput)) {
                System.out.println("Computer input not valid");
                System.out.println("User value " + RC.playerArr);
                System.out.println("Computer   " + RC.computerArr);
                ++RC.invalidInputs;
                continue;
            }
            RC.playerArr.add(playerInput);
            RC.computerArr.add(computerInput);
            System.out.println("User value " + RC.playerArr);
            System.out.println("Computer   " + RC.computerArr);
            System.out.println(" \n");
            System.out.println("Player Arr" + RC.playerArr);
            System.out.println("comp Arr" + RC.computerArr);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (RC.playerArr.contains(RC.arr[i][j])) {
                        RC.arr[i][j] = 0;
                        System.out.print(RC.arr[i][j]);
                        System.out.print("\t");
                    } else if (RC.computerArr.contains(RC.arr[i][j])) {
                        RC.arr[i][j] = 10;
                        System.out.print(RC.arr[i][j]);
                        System.out.print("\t");
                    } else {
                        System.out.print(RC.arr[i][j]);
                        System.out.print("\t");
                    }
                }
                System.out.println("\n");
            }
            TTT.ConditionCheckMthd(RC.arr, RC.reply, RC.invalidInputs, RC.playerArr, RC.computerArr);
        }
        }
}
