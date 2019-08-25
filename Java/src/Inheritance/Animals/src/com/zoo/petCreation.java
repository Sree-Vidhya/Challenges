package com.zoo;
import java.util.Scanner;
public class petCreation {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addingPetToDatabase();
    }

    private static void addingPetToDatabase(){
        String answer = "Y";
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your pet name");
            String name = scanner.nextLine();
            System.out.println("Is your pet Dog or Cat? \n Type D for Dog and \n C for Cat");
            String reply = scanner.nextLine();

            if (reply.equals("D")) {
                System.out.println("Enter your pet Breed");
                String breed = scanner.nextLine();
                System.out.println("How does your pet show happiness");
                String showingHappiness = scanner.nextLine();

                Dog newPet = new Dog(name, breed, showingHappiness);
              //  System.out.println(newPet);
                System.out.println("Hi my name is " + newPet.name + " and am a " + newPet.breed + ". I like to Show am happy by " + newPet.showingHappiness + " and Finally " + newPet.getTalk());

            } else if (reply.equals("C")) {
                System.out.println("Enter your pet Breed");
                String breed = scanner.nextLine();
                System.out.println("How does your pet show happiness");
                String showingHappiness = scanner.nextLine();

                cat newPet = new cat(name, breed, showingHappiness);
                System.out.println("Hi my name is " + newPet.name + " and am a " + newPet.breed + ". I like to Show am happy by " + newPet.showingHappiness + " and Finally " + newPet.getTalk());
            } else {
                System.out.println("Invalid Option");

//            System.exit(0);
            }
            System.out.println("Do you want to add another pet to the database? Press Y to continue and N to exit");
             answer = scanner.nextLine();
        }while(answer.equalsIgnoreCase ("Y"));


    }


}
