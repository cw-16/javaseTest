package com.wang.test01;

public class Test01 {
    public static void main(String[] args) {
//        1. 定义类 Test1
//        2. 定义 main方法
//        3. 定义两个byte类型变量b1,b2,并分别赋值为10和20.
        byte b1 = 10, b2 = 20;
//        4. 定义变量b3,保存b1和b2的和,并输出.
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        System.out.println("===================");
//        5. 定义两个short类型变量s1,s2,并分别赋值为1000和2000.
        short s1=1000,s2=2000;


//        6. 定义变量s3,保存s1和s2的和,并输出.
        short s3= (short) (s1+s2);
        System.out.println(s3);
        System.out.println("===================");

//        7. 定义一个char类型变量c1赋值为'a',一个int类型变量i1赋值为30.
        char c1='a';
        int i1=30;
//        8. 定义变量ch3,保存c1和i1的差,并输出.
        char ch3=(char) (c1-i1);
        System.out.println(ch3);
    }
}
