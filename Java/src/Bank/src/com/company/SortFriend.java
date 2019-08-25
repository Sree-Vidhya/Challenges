//package com.company;
//
//import java.lang.reflect.Array;
//import java.util.Calendar;
//import java.util.List;
//import java.util.Scanner;
//import java.util.TreeSet;
//import java.util.Arrays;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class SortFriend {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        TreeSet<Friend> friendsort = new TreeSet<>();
//        String loop = "y";
//        String month = null;
//        String choice = null;
//        String name=null;
//        int phoneNumber =0;
//        int age =0;
//        while(loop.equalsIgnoreCase( "y")){
//            System.out.println("Enter your friends name");
//             name =scanner.nextLine();
//            System.out.println("Enter their date of birth");
//            String dob = scanner.nextLine();
//            System.out.println("Enter the month they were born");
//             month = scanner.nextLine();
//            System.out.println("Enter the year they were born");
//            int year = Integer.parseInt(scanner.nextLine());
//             age = Calendar.getInstance().get(Calendar.YEAR) - year;
//            System.out.println("age" + age);
//            System.out.println("Phone number");
//            phoneNumber = scanner.nextLine();
//            Friend frnd1 = new Friend(name,month,age,phoneNumber);
//            friendsort.add(frnd1);
//            System.out.println("Do you want to continue?");
//             loop = scanner.nextLine();
//        }
//        friendsort.forEach(s-> System.out.println(s));
//        System.out.println("Do you want to filter by month?");
//        String reply =scanner.nextLine();
//        if(reply.equalsIgnoreCase("y")){
//            System.out.println("Which month do you want?");
//            String finalChoice = scanner.nextLine();
//            List<Friend> filteredList = friendsort.stream().filter(frnd -> {
//                return (frnd.getMonth().equalsIgnoreCase(finalChoice));
//            }).collect(Collectors.toList());
//            filteredList.forEach(s-> System.out.println(s));
//        }
//    }
//}
