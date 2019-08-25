import java.lang.Math.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number below 10");
        int n = Integer.parseInt(input.next());
        System.out.printf("Value with " + n + " digits after decimal point %." +n +"f %n", Math.PI);
        System.out.println("--------------------------------------------------------------------------------------------");
//        //Prime factorisation
//        int i = 2;
//        System.out.println("Enter a number");
//        int number = Integer.parseInt(input.next());
//        for (i = 2;i < n; i++){
//            if(n % i == 0){
//                System.out.println(i);
//            }
//            else{
//                i++;
//            }
//        }
    }
}
