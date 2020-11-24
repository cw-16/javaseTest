package com.wang.test08;

public class Test08 {
    public static void main(String[] args) {
//        1. 定义类 Test8
//        2. 定义 main方法
//        3. 定义printNum方法,在main方法中调用printNum方法
        printNum();

    }

    private static void printNum() {
//        4. printNum方法中,定义int类型变量i赋值为10,j 赋值为20;
        int i=10,j=20;
//        5. printNum方法中,将 i/5 的商 与 j的和 赋值给j
        j=(i/5)+j;
//        6. printNum方法中,定义int类型变量k,将j赋值给k.
        int k=j;
//        7. printNum方法中,最后同时输出 i, j ,k 的值,查看结果.
        System.out.println(" i, j ,k 的值: "+i+","+j+","+k);
    }
}
