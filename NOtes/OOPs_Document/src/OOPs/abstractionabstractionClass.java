package OOPs;

abstract class Bank
{
    abstract int getRateOfInterest();
}
class CommBank extends Bank
{
    int getRateOfInterest()
    {
        return 7;
    }
}
class ANZ extends Bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}
class WestPAC extends Bank
{
    int getRateOfInterest()
    {
        return 10;
    }
}
public class abstractionabstractionClass
{
    public static void main(String args[])
    {
        Bank b;
        b=new CommBank();
        System.out.println("Rate of Interest for CommBank is: "+b.getRateOfInterest()+" %");
        b=new ANZ();
        System.out.println("Rate of Interest for ANZ is: "+b.getRateOfInterest()+" %");
        b = new WestPAC();
        System.out.println("Rate of Interest for Westpac is: "+b.getRateOfInterest()+" %");
        }

}
