package com.onemorepackage;
import com.AnotherInheritance.AnotherClass;
import com.sinheritance.SubClassinSamePackage;
import com.sinheritance.SuperClass;
public class CreatingSubClassInstancesInDiffPackage {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.method4();
        SubClassinSamePackage sc1 = new SubClassinSamePackage();
        sc1.method4();
        AnotherClass Ac1 = new AnotherClass();
        Ac1.method4();
    }
}
