package org.exps;

public class Main {
    public static void main(String[] args) {
        A a = new C();
        B b = new C();
        C c = new C();
        a.m1();
        b.m1();
        //b.m2(); cannot access then how?
        ((C)b).m2();
        c.m1();
        c.m2();


    }
}
