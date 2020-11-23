package com.wang.test04;

public class Test04 {
    public static void main(String[] args) {
//        1. 定义类 Test4
//        2. 定义 main方法
//        3. 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
        int a1 = 10, a2 = 11;
        boolean b1 = a1 % 2 == 0;
        System.out.println(a1 + "是偶数吗？：" + b1);

        boolean b2 = a2 % 2 == 0;
        System.out.println(a2 + "是偶数吗？：" + b2);
//        4. 定义两个int类型变量a3和a4,分别赋值12,13,判断变量是否为奇数,拼接输出结果
        int a3 = 12, a4 = 13;
        boolean b3 = a3 % 2 == 0;
        System.out.println(a3 + "是偶数吗？：" + b3);

        boolean b4 = a4 % 2 == 0;
        System.out.println(a4 + "是偶数吗？：" + b4);
    }
}
