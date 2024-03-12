package com.mycompany.app.week2.Code2.AccessControl.Ex6;

public class Class2 extends Class1 {
    public void test2() {
        Class1 class2 = new Class1();
        class2.test();
        System.out.println(class2.a);
        class2.b = 10;
        System.out.println(class2.b);
    }
}
