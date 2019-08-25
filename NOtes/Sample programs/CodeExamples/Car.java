package com.myob.examples;

public class Car {
    String manufacturer;
    String model;
    String color;

    public Car(String manufacturer,
               String model,
               String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}