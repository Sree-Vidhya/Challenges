package OOPs.Inheritance;

    class Father{
        void transport(){System.out.println("Mode of transport: walking");}
    }
    class Child extends Father{
        void transport(){System.out.println("Mode of transport: Car");}
    }
    class grandChild extends Child{
        void fuel(){
            System.out.println("They can be solar powered as well");
        }
    }
public class MultiLevelInheritance
{
        public static void main(String args[]){
            grandChild g=new grandChild();
            g.transport();
            g.fuel();
        }
}
