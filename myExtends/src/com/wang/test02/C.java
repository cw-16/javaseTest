package com.wang.test02;

public class C extends B{

    int numC=30;
    @Override
    public void showB() {
        System.out.println("showB"+super.numb);
    }

    @Override
    public void showA() {
        System.out.println("showA:"+super.numa);
    }

    public void showC(){
        System.out.println("showC"+numC);
    }
}
