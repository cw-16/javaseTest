package com.wang.test05;

public class Avg {
    public static void main(String[] args) {
//        * 统计高于平均分的分数有多少个。
//  * 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
//  * 定义getAvg方法，获取一个数组中的平均数
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        getAvg(arr);
    }

    private static void getAvg(int[] arr) {
        int avg=0,count=0;
        for (int i = 0; i < arr.length; i++) {
            avg += (arr[i]/arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println("平均分为："+avg+"; 高于平均分的有: "+count);
    }
}
