package com.wang.test04;

public class Test04 {
    public static void main(String[] args) {
//        定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。
        getValue("最小", 10, 20, 30);
        getValue("最大", 10, 20, 30);

    }

    private static void getValue(String str, int i, int i1, int i2) {
        if (str.equals("最大")) {
            getMax(i, i1, i2);
        } else if (str.equals("最小")) {
            getMin(i, i1, i2);
        } else {
            System.out.println("输入有误");
        }

    }

    private static void getMin(int i, int i1, int i2) {
        for (int j = 0; j < 3; j++) {
            if (i < i1) {
                i1 = i2;
            } else {
                int k = i1;
                i1 = i;
                i = k;
            }
        }
        System.out.println(i);
    }

    private static void getMax(int i, int i1, int i2) {
        for (int j = 0; j < 3; j++) {
            if (i > i1) {
                i1 = i2;
            } else {
                int k = i1;
                i1 = i;
                i = k;
            }
        }
        System.out.println(i);
    }
}
