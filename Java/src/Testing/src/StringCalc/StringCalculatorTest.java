package StringCalc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest
{
    String emptyString = "";
    StringCalculator stringcal = new StringCalculator(emptyString);

    //1
    @Test
    public void testReturnZero()
    {
        assertEquals(0, stringcal.returnValue(""));
    }
    //2
    @Test
    public void testReturnNumber()
    {
        assertEquals(6, stringcal.returnValue("6"));
    }
    //3
    @Test
    public void testSumOfNumber()
    {
        assertEquals(10,stringcal.sumOfNumbersCommadelimited("6,4"));
    }
    //4
    @Test
    public void testSumOfNumberNewLine()
    {
        assertEquals(12,stringcal.sumOfNumbersNewLinedelimited("8\n4"));
    }
    //5
    @Test
    public void testsumOfNumbersDelimitEitherWay()
    {
        assertEquals(18,stringcal.sumOfNumbersDelimitEitherWay("8,6\n4"));
    }
//    //6
    @Test
    public void testVariousDelimiters()
    {
        assertEquals(3,stringcal.variousDelimiters("//;\n1;2"));
    }
    //7
    @Test
    public void negativeNumberThrowsException() throws Exception
    {
        assertEquals("Exception", StringCalculator.negativeNumberThrowsException("2,4\n-5"));
    }
    //8
    @Test
    public void testnumberGreaterThan1000areIgnored()
        {
        assertEquals(5, stringcal.numberGreaterThan1000areIgnored("2009,1000,5"));
    }
    //9
    @Test
    public void testsingleDelimiter()
    {
        assertEquals(6,stringcal.anyLengthDelimiter("//[***]\n1***2***3"));
    }
    //10
    @Test
    public void testmultipleDelimiters()
    {
        assertEquals(6,stringcal.multipleDelimiters("//[*][%]\n1*2%3"));
    }
    //11
    @Test
    public void testmultipleDelimiterswithLength()
    {
        assertEquals(10,stringcal.multipleDelimiterswithLength("//[***][#][%]\n1***2#3%4"));
    }
    //12
    @Test
    public void testdelimiterWithNumbers()
    {
        assertEquals(6,stringcal.delimiterWithNumbers("//[*1*][%]\n1*1*2%3"));
    }

}