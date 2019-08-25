package com.myob.zoo;
​
public class Dog extends Animal {
    void fetch(){
​
    }
​
    void talk(){
        super.setNoise("Woof woof!");
        super.talk();
    }
​
    int bones;
​
    public int getBones() {
        return bones;
    }
​
    public Dog(String name, int bones) {
        super(name);
        this.bones = bones;
    }
​
    public Dog() {
    }
​
    @Override
    public String toString() {
        return "I am a dog named "+this.name;
    }
​
}