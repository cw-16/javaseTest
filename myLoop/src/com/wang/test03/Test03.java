package com.wang.test03;

public class Test03 {
    public static void main(String[] args) {
//  1. 定义类 Test3
//  2. 定义 main方法
//  3. 使用for循环,初始化变量r为10,当`r>0`时,进入循环
        for (int r = 10; r > 0; r--) {
            //  4. for循环内,定义变量c,赋值为r
            int c=r;
//  5. for循环内,使用while循环,当`c>=0`时,输出c,再将c减2赋值给c
            while (c>=0){
                System.out.print(c+" ");
                c= c-2;
            }
//  6. for循环内,while循环外,r除以c赋值给r
            r=r/c;


        }

    }
}
