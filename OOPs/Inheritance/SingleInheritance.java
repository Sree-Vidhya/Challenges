package OOPs.Inheritance;

    class Animal{
        void speak(){System.out.println("Can vary...");}
    }
    class Dog extends Animal{
        void speak(){System.out.println("barking...");}
    }
public class SingleInheritance
{
        public static void main(String args[])
        {
            Dog d=new Dog(); // Dog has inherited from animal and this is method overriding
            d.speak();
            Animal a = new Animal();
            a.speak();
        }
}

