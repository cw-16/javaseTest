package com.wang.test09;

public class Test09 {
    public static void main(String[] args) {
//        1. 定义类 Test9
//        2. 定义 main方法
//        3. 定义printString方法
        printString();

    }

    private static void printString() {
//        4. printNum方法中,定义String 类型变量str.
        String str;
//        5. printNum方法中,定义int类型变量num,赋为任意整数值.
        int num = 101;
//        6. printNum方法中,通过三元运算符,判断num为偶数,将"偶数"赋值给str,否则将"奇数"赋值给str
        str = num % 2 == 0 ? "偶数" : "奇数";
//        7. printNum方法中,输出拼接效果
        System.out.println("num为:"+str);
    }
}
