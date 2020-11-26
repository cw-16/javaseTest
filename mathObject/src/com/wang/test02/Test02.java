package com.wang.test02;


import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //* 键盘录入QQ号码，验证格式的正确性。
        Scanner sc = new Scanner(System.in);
        String qqNum = sc.next();
        //  * 必须是5—12位数字。
        char[] qqChars = qqNum.toCharArray();
        if (qqChars.length >= 5 && qqChars.length <= 12) {
            for (int i = 0; i < qqChars.length; i++) {
                if (qqChars[0] != '0' && (qqChars[i] >= '0' && qqChars[i] <= '9') ){
                    System.out.println("qq号码合法");
                    break;
                }else {
                    System.out.println("qq号码不合法");
                    break;
                }
            }
        } else {
            System.out.println("qq号码不合法.");
        }

        //  * 0不能开头。
    }

}
