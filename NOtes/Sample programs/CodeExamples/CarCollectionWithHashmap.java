package com.myob.examples;

import java.util.HashMap;
import java.util.Scanner;

public class CarCollectionWithHashmap {
    public static void main(String[] args) {
        HashMap<Integer,Car> htCarCollection = new HashMap<Integer, Car>();

        Scanner scanner = new Scanner(System.in);
        String reply = "N";
        int i = 0;

        do {
            System.out.println("Manufacturer");
            String manufacturer = scanner.nextLine();
            System.out.println("model");
            String model = scanner.nextLine();
            System.out.println("color");
            String color = scanner.nextLine();
            Car car = new Car(manufacturer,model,color);

            htCarCollection.put(++i,car);

            System.out.println("Do you want to add another car? ");
            reply = scanner.nextLine();

        } while (reply.equalsIgnoreCase("Y"));

        System.out.println("The car collection is ");
        System.out.println(htCarCollection);

        for(int carNum : htCarCollection.keySet()) {

            System.out.printf("%d %s\n",carNum, htCarCollection.get(carNum));
        }

        for(Car car : htCarCollection.values()) {

            System.out.println(car);
        }

    }
}
