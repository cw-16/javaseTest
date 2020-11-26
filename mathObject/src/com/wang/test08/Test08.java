package com.wang.test08;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
//   模拟简单计算器，可以运算+，—，*，/，%。
//- 接收三个参数，一个整数，一个运算符，另一个整数。
//- 计算出运算结果。
//- 无法运算时，返回null。
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        String s = sc.nextLine();
        int num2 = sc.nextInt();

        caculate(num1,s,num2);

    }

    private static void caculate(int num1, String s, int num2) {

        switch (s){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("null");
                break;
        }
    }
}
