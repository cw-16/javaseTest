package com.wang.test01;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        //随机验证码。
        //* 随机生成十组六位字符组成的验证码。
        //* 验证码由大小写字母、数字字符组成。
        //开发提示：
        //* 使用字符数组保存原始字符，利用Random类生成随机索引。
        char[] chars={'0','1','2','3','4','5','6','7','8','9','0'
                ,'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u','v','w','x','y','z'
                ,'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print("第"+i+"组：");
            for (int j = 0; j < 6; j++) {
                System.out.print(chars[(int)(r.nextDouble()*63)]);
            }
            System.out.println();
        }
    }
}
