import java.lang.Math.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number below 10");
        int n = Integer.parseInt(input.next());
        System.out.printf("Value with " + n + " digits after decimal point %." +n +"f %n", Math.PI);
    }
}
