package com.wang.test05;

public class Test05 {
    public static void main(String[] args) {
//        1. 定义类 Test5
//        2. 定义 main方法
//        3. 定义一个int类型变量a,变量b,都赋值为20.
        int a = 20, b = 20;
//        4. 定义boolean类型变量bo , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo
        boolean bo = (++a % 3 == 0 && a++ % 7 == 0);
//        5. 输出a的值,bo的值.
        System.out.println("a为: " + a + ";" + "  ++a是否被3整除,并且a++是否被7整除: " + bo);
//        6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
        boolean bo2 = (b++ % 3 == 0 && ++b % 7 == 0);
//        7. 输出b的值,bo2的值.
        System.out.println("b为: " + b + ";" + "  b++是否被3整除,并且++b是否被7整除: " + bo2);



    }
}
