package com.myob.zoo;
        ​
public class Animal {
    String colour;
    double height;
    double weight;
    String name;
    String noise;
​
    void talk(){
        System.out.println("Hi, my name is " + name + "!" + noise);
​
    }
​
        ​
    public Animal(String name) {
        this.name = name;
    }
​
    public Animal() {
    }
​
    public String getColour() {
        return colour;
    }
​
    public void setColour(String colour) {
        this.colour = colour;
    }
​
    public double getHeight() {
        return height;
    }
​
    public void setHeight(double height) {
        this.height = height;
    }
​
    public double getWeight() {
        return weight;
    }
​
    public void setWeight(double weight) {
        this.weight = weight;
    }
​
    public String getName() {
        return name;
    }
​
    public void setName(String name) {
        this.name = name;
    }
​
    public String getNoise() {
        return noise;
    }
​
    public void setNoise(String noise) {
        this.noise = noise;
    }
​
    @Override
    public String toString() {
        return this.name;
    }
}