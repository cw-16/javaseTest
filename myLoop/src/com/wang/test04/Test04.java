package com.wang.test04;

public class Test04 {
    public static void main(String[] args) {
//        1. 定义类 Test4，定义 main方法
//        2. main方法中,定义int类型变量 a为10,b为20,c为30
        int a = 10, b = 20, c = 30;
//        3. 定义 method1方法, 定义变量a为-5,变量b为--a,判断a为偶数,则a赋值为++b,否则b赋值为--a.打印a,b
        method1();
//        4. 定义 method2方法, 定义变量a为0,使用while循环,判断a<=5,进入循环.
        method2();


//        9. main方法调用method1方法,method2方法
//        10. 输出a,b,c
        System.out.println(a+" "+b+" "+c);

    }

    private static void method2() {
        int a = 0;
//        5. while循环内部,使用for循环,初始化int类型变量b为1,当b<=5时进入循环, 步进表达式b++
        while (a <= 5) {
            for (int b = 1; b <= 5; b++) {
                //        6. for循环内,不换行输出i并拼接" "
                System.out.print(b+" ");
            }
            //        7. for循环外,输出换行.
            System.out.println();
            //        8. a自增.
            a++;
        }
    }

    private static void method1() {
        int a = -5;
        int b = --a;
        if (a % 2 == 0) {
            a = ++b;
        } else {
            b = --a;
        }
        System.out.println(a + " " + b);
    }

}
