package com.company;

import java.util.Scanner;

public class MyNewPhoneApp {
    /**
     * Runs this class and asks the user input for phone or music player or calculator or camera.
     * If user selected phone, they are prompted with more choices like placing call or waiting for a call, store or retrieve number.
     */
    private static SmartPhone myNewPhoneApp = new SmartPhone();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //In a loop ask the user what he wants to do and call the appropriate methods.
            do {
                System.out.println("What do you want to do: \nPress 1 for Phone. \nPress 2 for Music Player. \nPress 3 for Calculator. \nPress 4 for Camera ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("What do you want to do? \nPress 1 for placing a call \nPress 2 for waiting for a call \nPress 3 to store a number to phone book \nPress 4 to retrieve a number");
                        String phone = scanner.nextLine();
                        switch (phone) {
                            case "1":
                                System.out.println("Dial the number");
                                String number = scanner.nextLine();
                                myNewPhoneApp.call();
                                break;
                            case "2":
                                System.out.println("Call received");
                                myNewPhoneApp.receiveCall();
                                break;
                            case "3":
                                System.out.println("Enter the number to store");
                                String number1 = scanner.nextLine();
                                myNewPhoneApp.storenumberToPhoneBook();
                                break;
                            case "4":
                                myNewPhoneApp.retrieveNumberfromPhoneBook();
                                break;
                            default:
                                System.out.println("Invalid Option");
                                System.exit(0);
                        }
                        break;
                    case "2":
                        System.out.println("What do you want to do? \n Press 1 to play Music \n Press 2 to stop Music \n Press 3 to skip To Next Music \n Press 4 to skip To Previous Music \n Press 5 to forward \n Press 6 to rewind");
                        String musicPlayer = scanner.nextLine();
                        switch (musicPlayer) {
                            case "1":
                                myNewPhoneApp.playMusic();
                                break;
                            case "2":
                                myNewPhoneApp.stopMusic();
                                break;
                            case "3":
                                myNewPhoneApp.skipToNextMusic();
                                break;
                            case "4":
                                myNewPhoneApp.skipToPreviousMusic();
                                break;
                            case "5":
                                myNewPhoneApp.forward();
                                break;
                            case "6":
                                myNewPhoneApp.rewind();
                                break;
                            default:
                                System.out.println("Invalid option");
                                System.exit(0);
                        }
                        break;
                    case "3":
                        System.out.println("What do you want to do? \nPress 1 for adding \nPress 2 for subtracting \nPress 3 for multiplication to phone book \nPress 4 to divide");
                        String calc = scanner.nextLine();
                        System.out.println("Please Enter 2 numbers to perform the required action");
                        double a = Double.parseDouble(scanner.nextLine());
                        double b = Double.parseDouble(scanner.nextLine());
                        switch (calc) {
                            case "1":
                                System.out.println("The result is: " + myNewPhoneApp.add(a, b));
                                break;
                            case "2":
                                System.out.println("The result is: " + myNewPhoneApp.subtract(a, b));
                                break;
                            case "3":
                                System.out.println("The result is: " + myNewPhoneApp.multiply(a, b));
                                break;
                            case "4":
                                System.out.println("The result is: " + myNewPhoneApp.divide(a, b));
                                break;
                            default:
                                System.out.println("Invalid option");
                                System.exit(0);
                        }
                        break;
                    case "4":
                        System.out.println("What do you want to do? \nPress 1 for Taking picture \nPress 2 for waiting for processing picture \nPress 3 for saving picture");
                        String camera = scanner.nextLine();
                        switch (camera) {
                            case "1":
                                myNewPhoneApp.takePicture();
                                break;
                            case "2":
                                myNewPhoneApp.processPicture();
                                break;
                            case "3":
                                myNewPhoneApp.savePicture();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                        System.exit(0);
                }
            }while(true);
    }
}
