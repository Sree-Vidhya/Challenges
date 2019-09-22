package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TTT {
    List<Integer> playerArr = new ArrayList<>();
    List<Integer> computerArr = new ArrayList<>();
    int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    String reply = "y";
    int min = 1;
    int max = 9;
    int invalidInputs = 0;
    int playerInput;
    int computerInput;
    boolean again = true;

    public TTT() {

    }

    @Override
    public String toString() {
        return "TTT{" +
                "playerArr=" + playerArr +
                ", computerArr=" + computerArr +
                ", arr=" + Arrays.toString(arr) +
                ", reply='" + reply + '\'' +
                ", min=" + min +
                ", max=" + max +
                ", invalidInputs=" + invalidInputs +
                ", playerInput=" + playerInput +
                ", computerInput=" + computerInput +
                ", again=" + again +
                '}';
    }

    public TTT(List<Integer> playerArr, List<Integer> computerArr, int[][] arr, String reply, int min, int max, int invalidInputs, int playerInput, int computerInput) {
        this.playerArr = playerArr;
        this.computerArr = computerArr;
        this.arr = arr;
        this.reply = reply;
        this.min = min;
        this.max = max;
        this.invalidInputs = invalidInputs;
        this.playerInput = playerInput;
        this.computerInput = computerInput;
    }
    static void WelcomeMthd(){
        System.out.println("Welcome to TIC TAC TOE");
        System.out.println("----------------------");
            ResetMthd();
    }
    static int[][] ResetMthd(){
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println(" \n");
        }
        return arr;
    }
    static String ConditionCheckMthd(int[][] arr, String reply, int invalidInputs, List<Integer> playerArr, List<Integer> computerArr) {
        Scanner scanner = new Scanner(System.in);
        if((playerArr.contains(1)&playerArr.contains(2)&playerArr.contains(3)) || (playerArr.contains(4)&playerArr.contains(5)&playerArr.contains(6)) ||(playerArr.contains(7)&playerArr.contains(8)&playerArr.contains(9)) || (playerArr.contains(1)&&playerArr.contains(4)&&playerArr.contains(7)) || (playerArr.contains(2)&&playerArr.contains(5)&&playerArr.contains(8)) || (playerArr.contains(3)&&playerArr.contains(6)&&playerArr.contains(9)) || (playerArr.contains(1)&&playerArr.contains(5)&&playerArr.contains(9))|| (playerArr.contains(3)&&playerArr.contains(5)&&playerArr.contains(7))){
            System.out.println("Player Wins!!");
            System.out.println("Congratulations!! Do you want to continue playing?");
            reply = scanner.nextLine();
            playerArr.clear();
            computerArr.clear();
        }
        else if((computerArr.contains(1)&computerArr.contains(2)&computerArr.contains(3)) || (computerArr.contains(4)&computerArr.contains(5)&computerArr.contains(6)) ||(computerArr.contains(7)&computerArr.contains(8)&computerArr.contains(9)) || (computerArr.contains(1)&&computerArr.contains(4)&&computerArr.contains(7)) || (computerArr.contains(2)&&computerArr.contains(5)&&computerArr.contains(8)) || (computerArr.contains(3)&&computerArr.contains(6)&&computerArr.contains(9)) || (computerArr.contains(1)&&computerArr.contains(5)&&computerArr.contains(9))|| (computerArr.contains(3)&&computerArr.contains(5)&&computerArr.contains(7))){
            System.out.println("Computer Wins!!");
            System.out.println("Better Luck next time!");
            System.out.println("Do you want to continue playing?");
            reply = scanner.nextLine();
        }
        else if(invalidInputs > 8){
            System.out.println("It's a tie!! Do you want to continue? ");
            reply = scanner.nextLine();
        }
        return reply;
    }

}