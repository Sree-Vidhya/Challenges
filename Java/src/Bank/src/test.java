import com.company.Customer;
import org.w3c.dom.ls.LSOutput;
import com.company.Customer;
import com.company.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//	String word = "MADAM";
//	int length = word.length();
//	String reverse = "";
//	for (int i = length -1; i >= 0; i--) {
//        reverse = reverse + word.charAt(i);
//
//    }
//        System.out.println(word);
//        System.out.println(reverse);
//
//
//        if(word.equals(reverse)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }
        //---------------------------------------------------------------------------------------
//        System.out.println("Please enter an input");
//        int n = Integer.parseInt(input.nextLine());
//        int a = 0,b = 1,c = 0, i;
//        for(i = 0; i < n; i++){
//            c = a+b;
//            a = b;
//            b = c;
//            System.out.println(c);
//        }
        //-----------------------------------------------------------------------------------------
//        ArrayList<String> words = new ArrayList<String>();
//        String answer;
//        do {
//            System.out.println("Enter string");
//            String reply = input.nextLine();
//            int length = reply.length();
//            char item = reply.charAt(i);
//            for (int i = 0; i <= length -1; i++) {
//
//                if(item == 'a'|| item == 'e'|| item == 'i'|| item == 'o'|| item == 'u'){
////                    System.out.println(item);
//                    System.out.println("Found Vowel");
//                    break;
//                }
//            }
//            if(true) {
//                System.out.println("");
//            }else
//            {
//                words.add(reply);
//                System.out.println(words);
//            }
//
//            System.out.println("Do you want to continue? Y/N");
//            answer = input.nextLine();
//        }while(!(answer.equals("N")));
        //------------------------------------------------------------------------------------------------------------

//        System.out.println("Enter the first number");
//        int first = Integer.parseInt(input.nextLine());
//        System.out.println("How do u want to increment it?");
//        int inc = Integer.parseInt(input.nextLine());
//        int result = 0;
//        for (int i =0; i<20;i++){
//            result = first+inc;
//            System.out.println(result);
//            first = result;
//        }
//---------------------------------------------------------------------------------------
//        String answer;
//        do {
//            System.out.println("Enter a number");
//            int n = Integer.parseInt(input.nextLine());
//            for (int i = 1; i < n - 1; i++) {
//                int m = (n -i)*(n - i);
//                if (m == n) {
//                    System.out.println("Perfect square");
//                    System.out.println("The entered number is the perfect square of " + (n-i));
//                }
//            }
//            System.out.println("Do you want to continue? Y/N");
//            answer = input.nextLine();
//        }while(!(answer.equals("N")));
        //------------------------------------------------------------------------------
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        String answer;
////        int count = 1;
//        do {
//            System.out.println("Enter a number");
//            int n = Integer.parseInt(input.nextLine());
//                if(numbers.contains(n)) {
//                    System.out.println("same");
//                }
//                else{
//                    numbers.add(n);
//                    System.out.println(numbers);
//                }
//            System.out.println("Do u want to continue");
//            answer = input.nextLine();
//        }while(!(answer.equals("N")));
//--------------------------------------------------------------------------------------------
//            int result = 0;
//                for (int i = 0; i < 7; i++) {
//                    System.out.println("Press enter to roll the dice");
//                    String roll = input.nextLine();
//                    int y = (int) (Math.random() * 7);
//                    result = result + y;
//                    System.out.println(y);
////                    System.out.println(result);
//                    if (result > 20) {
//                        System.out.println("You win!!");
//                        break;
//                    }
//                   else{
//                       if(i == 6){
//                        System.out.println("Better luck next time");
//                    }}
//                }
        //-------------------------------------------------------------------------------------------------------------
//        ArrayList<String> words = new ArrayList<String>();
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        ArrayList<Customer> custlist = new ArrayList<>();
//        String reply;
//        do{
//            System.out.println("What information do you want to store? \nPress 1 for adding first name, last name and email and \nPress 2 for adding account number and custid \nPress 3 to display the customer object");
//            int choice = Integer.parseInt(input.nextLine());
//            switch(choice){
//                case 1:System.out.println("Please Enter the firstname");
//                    String fname = input.nextLine();
//                    words.add(fname);
//                    System.out.println("Please Enter the surname");
//                    String lname = input.nextLine();
//                    words.add(lname);
//                    System.out.println("Please Enter the email");
//                    String email = input.nextLine();
//                    words.add(email);
//
//                    break;
//                case 2: System.out.println("Please enter the custId");
//                    int id = Integer.parseInt(input.nextLine());
//                    numbers.add(id);
//                    System.out.println("Please enter the Account number");
//                    int accnt = Integer.parseInt(input.nextLine());
//                    numbers.add(accnt);
//                    System.out.println("Please enter the deposit amount");
//                    int amount = Integer.parseInt(input.nextLine());
//                    numbers.add(amount);
//                    break;
//                case 3:
//                    Customer cust1 = new Customer("Sree","Vidhya","sree@gmail.com","South Yarra","Banking");
//                    custlist.add(cust1);
//                    break;
//                default:
//                    System.out.println("Invalid data");
//            }
//
//            System.out.println("Do you want to continue? Y/N");
//            reply = input.nextLine();
//        }while(reply.equalsIgnoreCase("Y"));
//        System.out.println(words);
//        System.out.println(numbers);
//        System.out.println(custlist);
//        words.forEach(s ->{
//            System.out.println("the next element is");
//            System.out.println(s);
//        });
//
        //---------------------------------------------------------------------------------------------------------------
//        int[][] myIntDbleArray = new int[3][3];
//        int elementInt = 1;
//        for (int i =0;i < 3;i++){
//            for (int j =0; j<3;j++){
//                myIntDbleArray[i][j]= elementInt++;
//            }
//        }
//        System.out.println("Using for loop");
//        for (int i =0;i < 3;i++){
//            for (int j =0; j<3;j++){
//                System.out.println(myIntDbleArray[i][j]);
//            }
//        }
//        System.out.println("Using for each");
//        for (int[] rowArr:myIntDbleArray) {
//            for (int rowElement : rowArr) {
//                System.out.println(rowElement);
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//        ArrayList<String> words = new ArrayList<String>();
//        String reply = "y";
//        while(reply.equalsIgnoreCase("y")){
//            System.out.println("Enter a string");
//            String answer = input.nextLine();
//            words.add(answer);
//            System.out.println("Do you wish to continue?");
//            reply = input.nextLine();
//        }
//        words.forEach(s ->{
//            if(s.length() == 0){
//                System.out.println("Null :) ");
//            }
//            else{
//                System.out.println("***" + s + "***");
//            }
//        });
        //-----------------------------------------------------------------------
        ArrayList<String> words = new ArrayList<String>();
        List<String> filteredList = new ArrayList<String>();
        String reply = "y";
        while(reply.equalsIgnoreCase("y")){
            System.out.println("Enter a string");
            String answer = input.nextLine();
            words.add(answer);
            System.out.println("Do you wish to continue?");
            reply = input.nextLine();
        }
        words.forEach(s ->{
            if(s.length() == 0){
                System.out.println("Null :) ");
            }
            else{
                System.out.println("***" + s + "***");
            }
        });
        filteredList = words.stream().filter(s -> {
            return(s!= null && s.contains("ee"));
        }).collect(Collectors.toList());

        System.out.println("The filtered list");
        filteredList.forEach(s-> System.out.println(s));
        //---------------------------------------------------------------------------------------------------------------
        TreeSet<String> myTreeSet = new TreeSet<>();
        boolean continueLoop = true;
        while (continueLoop){
            System.out.println("Enter a string to add th the collection");
            String userInput = input.nextLine();
            myTreeSet.add(userInput);
            System.out.println("Do you want to continue?");
            continueLoop = input.nextLine().equalsIgnoreCase("Y");
        }
        myTreeSet.forEach(s-> System.out.println(s));
        //--------------------------------------------------------------------------------------------------------------
//        TreeMap<Integer,String> treeMap = new TreeMap<>();
//        boolean loopforever = true;
//        int key = 100;
//        while(loopforever){
//            System.out.println("Enter a string");
//            treeMap.put(key--, input.nextLine());
//            System.out.println("Do you want to continue?");
//            loopforever = input.nextLine().equalsIgnoreCase("Y");
//        }
//        for(int mapKey:treeMap.keySet()){
//            System.out.printf("%d - %s\n",mapKey,treeMap.get(mapKey));
//        }
//        treeMap.forEach((Koky,vovy)->{
//            System.out.printf("%d - %s",Koky,vovy);
//        });
//        treeMap.keySet().forEach(Koky->{
//            System.out.printf("%d - %s", Koky,treeMap.get(Koky));
//        });
        //-------------------------------------------------------------------------------------------------------------

        }
        }



