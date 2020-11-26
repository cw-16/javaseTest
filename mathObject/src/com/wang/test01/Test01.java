package com.wang.test01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //反转键盘录入的自负串
        //开发提示：
        //
        //* 使用字符数组保存原始字符，利用Random类生成随机索引。
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        String str = reverseStr(next);
        System.out.println(str);


    }

    private static String reverseStr(String next) {
        String s="";
        char[] chars = next.toCharArray();
        for (int i = 0; i < next.length(); i++) {
            s+=chars[next.length()-1-i];
        }

        return s;
    }
}
