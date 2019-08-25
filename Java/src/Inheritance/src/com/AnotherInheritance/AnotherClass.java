package com.AnotherInheritance;

import com.sinheritance.SuperClass;

public class AnotherClass extends SuperClass {

    @Override
    protected void method3() {
        super.method3();
        System.out.println("Another Class method 3");
    }

    @Override
    public void method4() {
        super.method4();
        System.out.println("Another Class method 4");
    }
}
