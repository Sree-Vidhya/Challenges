package com.myob.zoo;
​
public class Cat extends Animal {
    void scratch(){
​
    }
​
    void talk(){
        super.setNoise("meow");
        super.talk();
    }
​
    int scratchingPosts;
​
    public int getScratchingPosts() {
        return scratchingPosts;
    }
​
    public Cat(String name, int scratchingPosts) {
        super(name);
        this.scratchingPosts = scratchingPosts;
    }
​
    public Cat() {
    }
​
    @Override
    public String toString() {
        return "I am a cat named "+this.name;
    }
}