//package com.myob.zoo;
//import java.util.Scanner;
//
//public class petCreation extends Animal{
//    public petCreation(String breed, String color, String name, String talk) {
//        super(breed, color, name, talk);
//    }
//
//    public static void main(String[] args) {
//        Animal a1 = new Animal("Samoyed","White","Summer","Woof");
//        a1.setBreed("Samoyed");
//
//    }
//}
//package com.myob.zoo;

package com.myob.zoo;

public class PetCreation {

    public static void main(String[] args) {
//        Cat c1 = new Cat();
//        Cat c2 = new Cat("KitKat", 2);
//        Dog d1 = new Dog();
//        Dog d2 = new Dog("Spot", 7);
//
//        d1.fetch();
//        c1.scratch();
//
//        c1.talk();
//        c2.talk();
//        d1.talk();
//        d2.talk();

        int i =0;
        Arraylist<Animal> myZoo = new ArrayList<>();
        do {
            System.out.println("What do you want to create 1 or Cat \n 2 for dog");
            String reply = scanner.nextLine();
            Animal pet = null;
            switch (reply) {
                case "1":
                    System.out.println("Enter cat name");
                    String catname = scanner.nextLine();
                    pet = new Cat();
                    pet.setName(catName);
                    break;
                case "2":
                    System.out.println("Enter dog name:");
                    String dogname = scanner.nextLine();
                    pet = new Dog();
                    break;
            }
            myZoo.add(pet);
        }while(++i<5);
        for (Animal pet:myZoo){
            System.out.println(pet);

        }
    }
}

