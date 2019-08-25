package com.zoo;

public class Dog extends Animals{
    private String talk;

    public Dog(String name, String breed, String showingHappiness) {
        super(name, breed, showingHappiness);
        this.talk = "Woof!!";
    }

    public String getTalk() {
        return this.talk;
    }


    @Override
    public String toString() {
        return "Dog{" +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                "talk='" + talk + '\'' +
                ", showingHappiness='" + showingHappiness + '\'' +
                '}';
    }
}
