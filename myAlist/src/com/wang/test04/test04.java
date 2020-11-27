package com.wang.test04;

import java.util.ArrayList;
import java.util.Random;

public class test04 {
    public static void main(String[] args) {
        //统计数字出现次数。
        //
        //* 定义getNumList方法，随机生成100个数字，数字范围从1到10。
        //* 定义printCount方法，统计每个数字出现的次数并打印到控制台。

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> numList = getNumList(list);
        System.out.println(numList.size());
        printCount(numList);
    }

    private static void printCount(ArrayList<Integer> numList) {
        int[] count = new int[10];

        for (int i = 0; i < numList.size(); i++) {
            count[numList.get(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "出现了：" + count[i] + "次");
        }
    }

    private static ArrayList<Integer> getNumList(ArrayList<Integer> list) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);
            list.add(num);
        }

        return list;
    }
}
