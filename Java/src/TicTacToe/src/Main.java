import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>playerArr = new ArrayList<>();
        List<Integer>computerArr = new ArrayList<>();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        String reply = "y";
        int min =1;
        int max =9;
        int invalidInputs =0;
        System.out.println("Welcome to TIC TAC TOE");
        System.out.println("----------------------");
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println(" \n");
        }
        while(reply.equalsIgnoreCase("y")) {
            if(playerArr.size() == 0) {
                 arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            }
            int computerInput = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("Computer input: " + computerInput);
            System.out.println("Please enter the number to play tic tac toe");
            int playerInput = Integer.parseInt(scanner.nextLine());
            if((playerArr.contains(playerInput) || computerArr.contains(playerInput))){
                System.out.println("Player input not valid");
                System.out.println("User value " + playerArr);
                System.out.println("Computer   " + computerArr);
                ++invalidInputs;
                continue;
            }
            else if(computerInput == playerInput){
                System.out.println("Try again!!");
                ++invalidInputs;
                continue;
            }
            else if (playerArr.contains(computerInput)|| computerArr.contains(computerInput))
            {
                System.out.println("Computer input not valid");
                System.out.println("User value " + playerArr);
                System.out.println("Computer   " + computerArr);
                ++invalidInputs;
                continue;
            }
            playerArr.add( playerInput);
            computerArr.add(computerInput);
            System.out.println("User value " + playerArr);
            System.out.println("Computer   " + computerArr);
            System.out.println(" \n");
            for(int i = 0; i<3;i++){
                for(int j=0;j<3;j++) {
                    if (playerArr.contains(arr[i][j])){
                        arr[i][j] = 0;
                        System.out.print(arr[i][j]);
                        System.out.print("\t");
                    }
                    else if (computerArr.contains(arr[i][j])){
                        arr[i][j] = 10;
                        System.out.print(arr[i][j]);
                        System.out.print("\t");
                    }
                    else{
                        System.out.print(arr[i][j]);
                        System.out.print("\t");
                    }
                }
                System.out.println("\n");
            }
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
}}
}
