package OOPs;

interface IndianBank
{
int rateOfInterest();
}
class SBI implements IndianBank
{
    public int rateOfInterest() {
        return 5;
    }
}
class IOB implements IndianBank
{
    public int rateOfInterest() {
        return 7;
    }
}
class InterfaceBank
{
    public static void main(String[] args)
    {
        IndianBank sbi = new SBI();
        System.out.println("Rate of Interest for SBI: " +sbi.rateOfInterest());
        IndianBank iob = new IOB();
        System.out.println("Rate of Interest for IOB: "+iob.rateOfInterest());
    }
}
