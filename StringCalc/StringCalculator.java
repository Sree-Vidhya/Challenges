package StringCalc;

/*
 * This class prints the given message on console.
 */

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class StringCalculator {
    private String emptyString;
    private int emptyStringReturnsZero;


    //1 and 2
    public StringCalculator(String emptyString) {
        this.emptyString = emptyString;
    }

    public int returnValue(String emptyString) {
        System.out.println(emptyString);
        if (emptyString.equals("")) {
            emptyStringReturnsZero = 0;
        } else {
            emptyStringReturnsZero = Integer.parseInt(emptyString);
        }
        return emptyStringReturnsZero;
    }

    //3
    public int sumOfNumbersCommadelimited(String commaDelimitedValue) {
        String[] parts = commaDelimitedValue.split(",");
        int sumOfCommaLineDelimited = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        System.out.println(sumOfCommaLineDelimited);
        return sumOfCommaLineDelimited;
    }

    //4
    public static int sumOfNumbersNewLinedelimited(String newLineNumber) {
        String[] parts = newLineNumber.split("\n");
        int sumOfNewLineDelimited = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        System.out.println(sumOfNewLineDelimited);
        return sumOfNewLineDelimited;
    }

    //5
    public static int sumOfNumbersDelimitEitherWay(String commaNewLineNumber) {
        String[] parts = commaNewLineNumber.split(",");
        String[] secondPart = parts[1].split("\n");
        int sumEitherWay = Integer.parseInt(parts[0]) + Integer.parseInt(secondPart[0]) + Integer.parseInt(secondPart[1]);
        System.out.println(sumEitherWay);
        return sumEitherWay;
    }

    //6
    public static int variousDelimiters(String variousDelimiters) {
        String test = variousDelimiters.replace("\n", "");
        test = test.replace("//", "");
        String[] parts = test.split(";");
        int sumOfVariousDelimiters = (Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]));
        System.out.println(sumOfVariousDelimiters);
        return sumOfVariousDelimiters;
    }

    //7
    public static String negativeNumberThrowsException(String hasNegativeNumber) throws Exception {
        String[] parts = hasNegativeNumber.split(",");
        String[] secondPart = parts[1].split("\n");
        Byte number = (Byte.parseByte(parts[0]));
        Byte number1 = (Byte.parseByte(secondPart[0]));
        Byte number2 = (Byte.parseByte(secondPart[1]));
        if ((number < 0) || (number1 < 0) || (number2 < 0)) {
            try {
                System.out.println("Negative Number");
                throw new Exception("Negative number not Allowed");

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Positive Numbers");
            ;
        }

        return "Exception";
    }

    //8
    public static int numberGreaterThan1000areIgnored(String allNumbers) {
        String[] parts = allNumbers.split(",");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int sumOfNumberLessThan1000 = 0;
        if ((a > 999) || (b > 999) || (c > 999)) {
            if ((a > 999) && (b > 999) && (c > 999)) {
                a = 0;
                b = 0;
                c = 0;
            } else if ((a > 999) && (b > 999)) {
                a = 0;
                b = 0;
            } else if ((b > 999) && (c > 999)) {
                c = 0;
                b = 0;
            } else if ((c > 999) && (a > 999)) {
                a = 0;
                c = 0;
            } else if (a > 999) {
                a = 0;
            } else if (b > 999) {
                b = 0;
            } else if (c > 999) {
                c = 0;
            }

        }
        sumOfNumberLessThan1000 = a + b + c;
        System.out.println(sumOfNumberLessThan1000);
        return sumOfNumberLessThan1000;
    }

    //9
    public static int anyLengthDelimiter(String anyLengthDelimiter) {
        String test = anyLengthDelimiter.replace("\n", "");
        test = test.replace("//", "");
        test = test.replace("[***]", "");
        test = test.replace("***", ",");
        String[] parts = test.split(",");
        int sumOfAnylengthDelimiter = ((Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) + Integer.parseInt(parts[2])));
        System.out.println(sumOfAnylengthDelimiter);
        return sumOfAnylengthDelimiter;
    }

    //10
    public static int multipleDelimiters(String multipleDelimiters) {
        multipleDelimiters = multipleDelimiters.replace("*1*", "");
        String[] parts = multipleDelimiters.split("\n");
        String[] value3 = parts[1].split("%");
        value3[0] = value3[0].replace("*", ",");
        String[] firstValues = value3[0].split(",");
        int sum = (Integer.parseInt(value3[1]) + Integer.parseInt(firstValues[0]) + Integer.parseInt(firstValues[1]));
        System.out.println(sum);
        return sum;
    }

    //11
    public static int multipleDelimiterswithLength(String delimitersWithLength) {
        delimitersWithLength = delimitersWithLength.replace("***", ",");
        String[] parts = delimitersWithLength.split("\n");
        String[] firstPart = parts[1].split(",");
        String[] secondPart = firstPart[1].split("#");
        String[] thirdPart = secondPart[1].split("%");
        int sum = (Integer.parseInt(firstPart[0]) + Integer.parseInt(secondPart[0]) + Integer.parseInt(thirdPart[0]) + Integer.parseInt(thirdPart[1]));
        System.out.println(sum);
        return sum;
    }

    //12
    public static int delimiterWithNumbers(String numberDelimiters)
    {
        numberDelimiters = numberDelimiters.replace("1*1*", "1,");
        String [] parts = numberDelimiters.split("\n");
        String[] value1 = parts[1].split(",");
        String[] value2 = value1[1].split("%");
        int sum =(Integer.parseInt(value1[0]) + Integer.parseInt(value2[0]) + Integer.parseInt(value2[1]));
        System.out.println(sum);
        return sum;
    }
}