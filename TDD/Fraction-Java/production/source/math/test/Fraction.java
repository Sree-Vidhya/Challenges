package math.test;

public class Fraction
{
   private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that)
   {
       return new Fraction(this.integerValue + that.integerValue);
   }

    public int intValue()
    {
        return integerValue;
    }
}
