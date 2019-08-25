package com.myob.zoo;//package com.myob.zoo;
//
//public class subclassDog extends Animal {
//
//    public subclassDog(String breed, String color, String name, String talk) {
//        super(breed, color, name, talk);
//    }
//
//    @Override
//    public void setBreed(String breed) {
//        super.setBreed(breed);
//    }
//
//    @Override
//    public String getBreed() {
//        return super.getBreed();
//    }
//
//    @Override
//    public void setColor(String color) {
//        super.setColor(color);
//    }
//
//    @Override
//    public String getColor() {
//        return super.getColor();
//    }
//
//    @Override
//    public String getHappy() {
//        return super.getHappy();
//    }
//
//    @Override
//    public void setHappy(String happy) {
//        super.setHappy(happy);
//    }
//
//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public String getTalk() {
//        return "Woof Woof";
//    }
//
//    @Override
//    public void setTalk(String talk) {
//        super.setTalk(talk);
//    }
//}
//package com.myob.zoo;

package com.myob.zoo;
        ​
public class subClassDog extends Animal {
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
    public subClassDog(String name, int bones) {
        super(name);
        this.bones = bones;
    }
​
    public subClassDog() {
    }
​
    @Override
    public String toString() {
        return "I am a dog named "+this.name;
    }
​
}