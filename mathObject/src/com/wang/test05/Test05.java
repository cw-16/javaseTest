package com.wang.test05;



import java.text.Format;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Test05 {
    public static void main(String[] args) {
//        生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
        Random random=new Random();
        double nextDouble = random.nextDouble()*100;
        System.out.println(nextDouble);
        System.out.printf("%.2f",nextDouble);

    }

}
