package com.sinheritance;

public class SubClassinSamePackage extends SuperClass {
    @Override
    void method2() {
        super.method2();
        System.out.println("Method2 from the subclass");
    }

    @Override
    protected void method3() {
        super.method3();
        System.out.println("Method3 from the subclass");
    }

    @Override
    public void method4() {
        super.method4();
        System.out.println("Method4 from the subclass");
    }
}
