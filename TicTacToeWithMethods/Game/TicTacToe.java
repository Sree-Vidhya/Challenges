package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TicTacToe {
    static void  ConditionCheckMthd(int[][] arr, String reply, int invalidInputs, List<Integer> playerArr, List<Integer>computerArr) {
        List<Integer>arrylst = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        if((playerArr.contains(1)&playerArr.contains(2)&playerArr.contains(3)) || (playerArr.contains(4)&playerArr.contains(5)&playerArr.contains(6)) ||(playerArr.contains(7)&playerArr.contains(8)&playerArr.contains(9)) || (playerArr.contains(1)&&playerArr.contains(4)&&playerArr.contains(7)) || (playerArr.contains(2)&&playerArr.contains(5)&&playerArr.contains(8)) || (playerArr.contains(3)&&playerArr.contains(6)&&playerArr.contains(9)) || (playerArr.contains(1)&&playerArr.contains(5)&&playerArr.contains(9))|| (playerArr.contains(3)&&playerArr.contains(5)&&playerArr.contains(7))){
            System.out.println("Player Wins!!");
            System.out.println("Congratulations!!");
            System.exit(0);
        }
        else if((computerArr.contains(1)&computerArr.contains(2)&computerArr.contains(3)) || (computerArr.contains(4)&computerArr.contains(5)&computerArr.contains(6)) ||(computerArr.contains(7)&computerArr.contains(8)&computerArr.contains(9)) || (computerArr.contains(1)&&computerArr.contains(4)&&computerArr.contains(7)) || (computerArr.contains(2)&&computerArr.contains(5)&&computerArr.contains(8)) || (computerArr.contains(3)&&computerArr.contains(6)&&computerArr.contains(9)) || (computerArr.contains(1)&&computerArr.contains(5)&&computerArr.contains(9))|| (computerArr.contains(3)&&computerArr.contains(5)&&computerArr.contains(7))){
            System.out.println("Computer Wins!!");
            System.out.println("Better Luck next time!");
            System.exit(0);
        }
        else if(invalidInputs > 8){
            System.out.println("It's a tie!! ");
            System.exit(0);
        }
    }
    static public void WelcomeMthd(){
        System.out.println("Welcome to TIC TAC TOE");
        System.out.println("----------------------");
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> playerArr = new ArrayList<>();
        List<Integer> computerArr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println(" \n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> playerArr = new ArrayList<>();
        List<Integer> computerArr = new ArrayList<>();
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String reply = "y";
        int min = 1;
        int max = 9;
        int invalidInputs = 0;
        WelcomeMthd();

        while (reply.equalsIgnoreCase("y")) {
            int computerInput = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("Computer input: " + computerInput);
            System.out.println("Please enter the number to play tic tac toe");
            int playerInput = Integer.parseInt(scanner.nextLine());
            if ((playerArr.contains(playerInput) || computerArr.contains(playerInput))) {
                System.out.println("Player input not valid");
                System.out.println("User value " + playerArr);
                System.out.println("Computer   " + computerArr);
                ++invalidInputs;
                continue;
            } else if (computerInput == playerInput) {
                System.out.println("Try again!!");
                ++invalidInputs;
                continue;
            } else if (playerArr.contains(computerInput) || computerArr.contains(computerInput)) {
                System.out.println("Computer input not valid");
                System.out.println("User value " + playerArr);
                System.out.println("Computer   " + computerArr);
                ++invalidInputs;
                continue;
            }
            playerArr.add(playerInput);
            computerArr.add(computerInput);
            System.out.println("User value " + playerArr);
            System.out.println("Computer   " + computerArr);
            System.out.println(" \n");
            System.out.println("Player Arr" + playerArr);
            System.out.println("comp Arr" + computerArr);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (playerArr.contains(arr[i][j])) {
                        arr[i][j] = 0;
                        System.out.print(arr[i][j]);
                        System.out.print("\t");
                    } else if (computerArr.contains(arr[i][j])) {
                        arr[i][j] = 10;
                        System.out.print(arr[i][j]);
                        System.out.print("\t");
                    } else {
                        System.out.print(arr[i][j]);
                        System.out.print("\t");
                    }
                }
                System.out.println("\n");
            }
            ConditionCheckMthd( arr,reply,invalidInputs,playerArr,computerArr);
        }
    }
    }

