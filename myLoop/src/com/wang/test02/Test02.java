package com.wang.test02;

public class Test02 {
    public static void main(String[] args) {
//  1. 定义类 Test2
//  2. 定义 main方法
//  3. 定义变量 discount为1, totalPrice为550
        double disCount=1;
        int totalPrice=550;
//  4. 判断当`totalPrice >=500` ,discount赋值为0.5
        if(totalPrice>=500){
            disCount=0.5;
        }else if (totalPrice>=400){
            //  5. 判断当`totalPrice >=400` 且`<500`时,discount赋值为0.6
            disCount=0.6;
        }else if (totalPrice>=300){
            //  6. 判断当`totalPrice >=300` 且`<400`时,discount赋值为0.7

            disCount=0.7;
        }else if (totalPrice>=200){
            //  7. 判断当`totalPrice >=200` 且`<300`时,discount赋值为0.8

            disCount=0.8;
        }
        System.out.println("totalPrice:"+totalPrice+"; totalPrice*discount="+totalPrice*disCount);

//  8. 输出totalPrice.
//  9. 输出totalPrice 与 discount 的积
    }
}
