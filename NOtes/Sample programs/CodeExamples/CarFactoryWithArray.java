package com.myob.examples;

import java.util.Scanner;

public class CarFactoryWithArray {
    public static void main(String s[]) {
        Car[] carCollection = new Car[3];
        Scanner scanner = new Scanner(System.in);

        for(Car eachCar:carCollection) {
            System.out.println("Manufacturer");
            String manufacturer = scanner.nextLine();
            System.out.println("model");
            String model = scanner.nextLine();
            System.out.println("color");
            String color = scanner.nextLine();
            eachCar = new Car(manufacturer,model,color);
            System.out.println(eachCar);
        }

        for(Car eachCar:carCollection) {
            System.out.println(eachCar);
        }

        for(int i=0;i<carCollection.length;i++) {
            System.out.println("Manufacturer");
            String manufacturer = scanner.nextLine();
            System.out.println("model");
            String model = scanner.nextLine();
            System.out.println("color");
            String color = scanner.nextLine();
            carCollection[i] = new Car(manufacturer,model,color);
        }

        for(Car eachCar:carCollection) {
            System.out.println(eachCar);
        }

    }
}