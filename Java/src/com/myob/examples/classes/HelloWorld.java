package com.myob.examples;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Universe!!!");

        String s = "Java is cool!";

        System.out.println("Char at "+s.charAt(0));
        System.out.println("Compare "+s.compareTo("Java is hot!"));
        System.out.println("Concat "+s.concat("So am I."));
        System.out.println("Contains 'cool' "+s.contains("cool"));
        System.out.println("Contains 'hot' "+s.contains("cool"));
        System.out.println("Ends with 'cool!' "+s.endsWith("cool!"));
        System.out.println("Ends with 'hot!' "+s.endsWith("hot!"));
        System.out.println("Index of 'cool'"+s.indexOf("cool"));
        System.out.println("Index of 'hot'"+s.indexOf("cool"));
        System.out.println("Index of space"+s.indexOf(" "));
        System.out.println("Last index of space"+s.lastIndexOf(" "));
        System.out.println(s.split(" "));

        String sWithSpace = "    Java is so cool!     ";
        System.out.println(sWithSpace);
        System.out.println(sWithSpace.trim());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());


        System.out.println("Substring from 5th position - "+s.substring(5));
        System.out.println("Substring from 5th position to 10th position - "+s.substring(5,10));

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1.equals(str2));
        System.out.println("The equality of the two objects" + str1 == str2);

    }
}
