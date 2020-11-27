package com.wang.test05;

import java.util.ArrayList;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
//       模拟统计班级考试分数分布情况，分别统计100-80，79-60，59-40，39-0各个阶段的人数。
//
//* 定义getScoreList方法，随机生成50个数字，数字范围从0到100。
//* 定义countScore方法，统计各个阶段的分数个数。
//* 定义printCount方法，打印各个阶段的统计结果。

        int[] count = new int[4];

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> scoreList = getScoreList(list);

        printCount(scoreList,count);
    }

    private static int[] countScore(ArrayList<Integer> list, int[] count) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 80) {
                count[3]++;
            } else if (list.get(i) > 60) {
                count[2]++;
            } else if (list.get(i) > 40) {
                count[1]++;
            } else {
                count[0]++;
            }
        }
        return count;
    }

    private static void printCount(ArrayList<Integer> scoreList, int[] count) {
        int[] ints = countScore(scoreList, count);

            System.out.println("80-100:"+ints[3]);
            System.out.println("60-80:"+ints[2]);
            System.out.println("40-600:"+ints[1]);
            System.out.println("0-40:"+ints[0]);



    }

//    private static void countScore(ArrayList<Integer> list, int count80, int count60, int count40, int count0) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) >= 80) {
//                count80++;
//            } else if (list.get(i) > 60) {
//                count60++;
//            } else if (list.get(i) > 40) {
//                count40++;
//            } else {
//                count0++;
//            }
//        }
//    }

    private static ArrayList<Integer> getScoreList(ArrayList<Integer> list) {
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(101);
            list.add(num);
        }

        return list;

    }
}
