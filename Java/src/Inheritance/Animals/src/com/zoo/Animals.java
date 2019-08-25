package com.zoo;

public class Animals {
String name;
String breed;
String showingHappiness;

    public Animals(String name, String breed,  String showingHappiness) {
        this.name = name;
        this.breed = breed;
        this.showingHappiness = showingHappiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public String getShowingHappiness() {
        return showingHappiness;
    }

    public void setShowingHappiness(String showingHappiness) {
        this.showingHappiness = showingHappiness;
    }
}
