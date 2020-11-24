package com.wang.test10;

public class Test10 {
    public static void main(String[] args) {
//        1. 定义类 Test10
//        2. 定义 main方法
//        3. 定义add方法,打印两个变量的和
        add(10, 20);
//        4. 定义sub方法,打印两个变量的差
        sub(10, 20);
//        5. 定义mul方法,打印两个变量的积
        mul(10, 20);
//        6. 定义div方法,打印两个变量的商
        div(10, 20);
//        7. 定义remain方法,打印两个变量的余数
        remain(20, 10);
//        8. main方法中,依次调用add方法,sub方法,mul方法,div方法,remain方法
    }

    private static void mul(int i, int i1) {
        System.out.println(i*i1);

    }

    private static void add(int i, int i1) {
        System.out.println(i+i1);
    }
    private static void sub(int i, int i1) {
        System.out.println(i-i1);

    }

    private static void div(int i, int i1) {
        System.out.println(i/i1);

    }

    private static void remain(int i, int i1) {
        System.out.println(i%i1);

    }
}
