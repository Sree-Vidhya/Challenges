package OOPs;

public class RuntimePolymorphismDog
{
    void appearance()
    {
        System.out.println("Looks like ");
    }
}
class Samoyed extends RuntimePolymorphismDog
{
    void appearance()
    {
        System.out.println("White Fluff!! ");
    }
}
class Labrador extends RuntimePolymorphismDog
{
    void appearance()
    {
        System.out.println("Chocolate Fluff!! ");
    }
}
class Looks{
    public static void main(String[] args) {
        RuntimePolymorphismDog Summer = new Samoyed();
        Summer.appearance();
        Summer = new Labrador();
        Summer.appearance();
    }
}