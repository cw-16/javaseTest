package com.wang.test03;


import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseDVFactory;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //* 字符串查找。
        //  * 键盘录入一个大字符串，再录入一个小字符串。
        //  * 统计小字符串在大字符串中出现的次数。
        Scanner sc = new Scanner(System.in);

        String bigStr = sc.next();
        String smallStr = sc.next();

        int count = 0;
        for (int i = 0; i < bigStr.length(); i++) {
            if (bigStr.length() < smallStr.length()) {
                break;
            }
            int l = bigStr.indexOf(smallStr);
            if (l >= 0 && i == bigStr.indexOf(smallStr)) {
                count++;
                bigStr = bigStr.replaceFirst(String.valueOf(bigStr.charAt(i)), "");
                i--;
            }
        }
        System.out.println("出现的次数为：" + count);
    }

}
