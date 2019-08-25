package com.myob.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class CarFactoryWithArrayList {
    public static void main(String s[]) {
        ArrayList<Car> carCollection = new ArrayList<Car>();

        Scanner scanner = new Scanner(System.in);
        String reply = "N";

        do {
            System.out.println("Manufacturer");
            String manufacturer = scanner.nextLine();
            System.out.println("model");
            String model = scanner.nextLine();
            System.out.println("color");
            String color = scanner.nextLine();
            carCollection.add(new Car(manufacturer,model,color));

            System.out.println("Do you want to add another car? ");
            reply = scanner.nextLine();

        } while (reply.equalsIgnoreCase("Y"));

        for(Car eachCar:carCollection) {
            System.out.println(eachCar);
        }
    }
}