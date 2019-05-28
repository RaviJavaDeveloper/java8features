package org.exps;

public class B implements A {
    @Override
    public void m1(){
        System.out.println("Class b - m1");
    }

    @Override
    public String valueOf(int i) {
        return null;
    }

    @Override
    public String valueOf(Integer i) {
        return null;
    }
}
