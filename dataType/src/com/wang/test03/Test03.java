package com.wang.test03;

import javax.crypto.spec.PSource;

public class Test03 {
    public static void main(String[] args) {
//        1. 定义类 Test3
//        2. 定义 main方法
//        3. 定义char类型变量ch,赋值为'J'
        char ch='J';
//        4. 使用强制转换的方式,将变量ch转换为小写'j',并输出
        System.out.println((char)(ch+32));
//        5. 定义char类型变量ch2,赋值为'a'
        char ch2='a';
//        6. 使用+=的方式,将变量ch2转换为大写'A',并输出
        ch2-=32;
        System.out.println(ch2);
//        7. 定义double类型变量d3,int类型变量i3
        double d3=100.8;
        int i3=100;
//        8. 定义double变量sum3,保存d3与i3的和,输出sum3的值和sum3去除小数部分的值
        double sum3=d3+i3;
        System.out.println("sum3的值为："+sum3+"; "+"除去小数部分为："+(int)(sum3));
//        9. 定义double类型变量d4,int类型变量i4
        double d4=100.6;
        int i4=2;
//        10. 定义int变量mul4,保存d4和i4乘积的整数部分,并输出
        int mul4=(int)(d4*i4);
        System.out.println(mul4);


    }
}
