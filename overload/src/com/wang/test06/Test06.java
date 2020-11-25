package com.wang.test06;

public class Test06 {
    public static void main(String[] args) {
        //定义round方法，接收一位小数，实现四舍五入运算，并返回结果。
        round(1.3);
        round(1.6);
    }

    private static void round(double v) {
        System.out.println((int)(v+0.5));
    }
}
