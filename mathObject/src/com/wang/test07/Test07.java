package com.wang.test07;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
//判断回文字符串。如果一个字符串，从前向后读和从后向前读，
// 都是一个字符串，称为回文串，比如mom，dad，noon。
        Scanner sc=new Scanner(System.in);

        String str = sc.next();

        boolean flag=false;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                flag=true;
            }else {
                flag=false;
            }
        }
        if (flag){
            System.out.println(str+"是回文字符串。");
        }else {
            System.out.println(str+"不是回文字符串。");

        }
    }

}
