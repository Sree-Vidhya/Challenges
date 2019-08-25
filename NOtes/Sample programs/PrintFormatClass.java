package com.myob;

import java.util.function.Consumer;

public class PrintFormatClass {
    public static Consumer formatAndPrintString = (s)-> {
        if(s != null) {
            System.out.printf("*** %s ***\n",s);
        } else {
            System.out.println("### NULL ***");
        }
    };

}
