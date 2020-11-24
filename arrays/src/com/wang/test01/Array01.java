package com.wang.test01;

public class Array01 {
    public static void main(String[] args) {
//         * 一组大乐透号码由10个1-99之间的数字组成
        int[] arr={10,20,30,40,50,60,70,80};
//         * 定义方法，打印大乐透号码信息
        methon(arr);
    }

    private static void methon(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
