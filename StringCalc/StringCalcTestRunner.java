package StringCalc;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import javax.print.DocFlavor;

public class StringCalcTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(StringCalculatorTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if(result.wasSuccessful() == true){
            System.out.println("SUCCESS");
        }
    }
}
