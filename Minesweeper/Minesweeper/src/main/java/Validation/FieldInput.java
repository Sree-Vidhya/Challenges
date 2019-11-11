package Validation;

import java.util.Scanner;

public class FieldInput {
    Scanner input = new Scanner(System.in);
    public String inputSameLine(){
        return input.next();
    }
    public String inputNextLine()
    {
        return input.nextLine();
    }
}
