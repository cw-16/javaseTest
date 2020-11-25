package com.wang.test05;

import java.util.Scanner;

public class PrintXTest {
    public static void main(String[] args) {
//        定义printX方法，打印任意行的图形。
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printX(num);

    }

    private static void printX(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j || i+j==num+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
