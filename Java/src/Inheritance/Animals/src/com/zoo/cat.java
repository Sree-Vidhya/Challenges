package com.zoo;

public class cat extends Animals{
private String talk;

    public cat(String name, String breed, String showingHappiness) {
        super(name, breed,showingHappiness);
        this.talk = "Meow!!";
    }

    public String getTalk() {
        return this.talk;
    }


    @Override
    public String toString() {
        return "cat{" +
                ", name='" + this.name + '\'' +
                ", breed='" + this.breed + '\'' +
                ", showingHappiness='" + showingHappiness + '\'' +
                "talk='" + talk + '\'' +
                '}';
    }
}
