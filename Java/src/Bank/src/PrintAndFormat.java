import java.util.function.Consumer;

public class PrintAndFormat {
    Consumer formatAndPrintString = (s) -> {
        if(s!=null){
            System.out.println("printing");
        }
        else{
            System.out.println("Null value");
        }
    };
}
