package OOPs.Inheritance;

class Mother{
        void eat(){System.out.println("Allergic to gluten");}
    }
    class Sibling1 extends Mother{
        void allergy1(){System.out.println("Allergic to Lactose");}
    }
    class Sibling2 extends Mother{
        void allergy2(){System.out.println("Allergic to nuts");}
    }
public class HierarchialInheritance
{
        public static void main(String args[]){
            Sibling1 c=new Sibling1();
            c.allergy1();
            c.eat();
//            c.allergy2();    error.
        }
}
