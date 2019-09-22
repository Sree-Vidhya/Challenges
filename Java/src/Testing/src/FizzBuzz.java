public class FizzBuzz
{

    public static void main(String[] args)
    {
        //Test case 1
        //arrange
        //set up classes, data etc if needed

        //act
        String result = GetLineToPrint(5);

        //assert
        Assert(result, "7");

        //Test case 2
        //arrange

        //act
        String result2 = GetLineToPrint(3);

        //assert
        Assert(result2, "FIzz");

        //TestCase3
        WhenNumberIs5_IShouldGetBuzz();

        //TestCase4
        //arrange

        //act
        String result3 = GetLineToPrint(15);

        //assert
        Assert(result3, "Fizz Buzz");
    }

    public static void WhenNumberIs5_IShouldGetBuzz()
    {
        //arrange

        //act
        String result2 = GetLineToPrint(5);

        //assert
        Assert(result2, "Buzz");
    }

    public static void main2()
    {
        for( int i = 1; i < 101; i++)
        {
            System.out.println(GetLineToPrint(i));
        }
    }

    public static String GetLineToPrint(int number)
    {
            if((number % 3 ==0) && (number % 5 ==0 )){
                return "Fizz Buzz";
            }

            if(number % 3 == 0){
                return "Fizz";
            }

            if( number % 5 == 0){
                return "Buzz";
            }

        return Integer.toString(number);
    }

    public static void Assert(String actual, String expected)
    {
        if(actual.equals(expected))
        {
            System.out.println("Test Passed!!");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
}
