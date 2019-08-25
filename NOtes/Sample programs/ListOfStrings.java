package com.myob;

import java.util.ArrayList;
import java.util.Scanner;

/*
Pseudocode

1. Create an arraylist which will take string
2. Create a scanner object to obtain user input
3. Create a variable to register user response
4. Create a loop
5. Get a string from the user.
6. Create an int variable to capture the vowel count
7. Go through the string character by character to see if it is a vowel. If it is, increment the vowel count by 1
8.  If vowel count is less than two, add the string to the list
9. Ask the user if he wants to enter more strings
10. If yes, continue to step 5. Else go to step 11.
11. create a for-each loop for the array list and print each item in the list.
 */
public class ListOfStrings {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String answer = "N";

        do {
            System.out.println("Enter a String");
            String newString = scanner.nextLine();
            int vowelCount = 0;
            for(char eachChar:newString.toCharArray()) {
//                if(eachChar == 'A' || eachChar == 'E' || eachChar == 'I' || eachChar == 'O' || eachChar == 'U' ||
//                        eachChar == 'a' || eachChar == 'e' || eachChar == 'i' || eachChar == 'o' || eachChar == 'u') {
//                    vowelCount++;
//                }

                //Elizabeth's approach
                if("aeiouAEIOU".indexOf(eachChar) != -1) {
                    vowelCount++;
                }
            }


            if(vowelCount < 2) {
                myList.add(newString);
            } else {
                System.out.println("Too many vowels in word");
            }
            System.out.println("Do you want to continue?");
            answer = scanner.nextLine();
        } while(answer.equalsIgnoreCase("Y"));

        for(String eachItem : myList) {
            System.out.println(eachItem);
        }
    }
}
