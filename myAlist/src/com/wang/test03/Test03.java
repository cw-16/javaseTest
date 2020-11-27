package com.wang.test03;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        //集合工具类。
        //
        //* 定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
        //* 定义replace方法，将某集合中的某元素，全部替换为新元素

        ArrayList<Integer> list =new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(22);
        list.add(44);

        int index = findIndex(list, 22);
        System.out.println("目标所在位置:"+index);

        ArrayList<Integer> replace = replace(list, 22, 88);

        for (int i = 0; i < replace.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static ArrayList<Integer> replace(ArrayList<Integer> list, int i, int i2) {
        while (findIndex(list, i)!=-1){
            list.set(findIndex(list, i),i2);
        }
        return list;
    }

    private static int findIndex(ArrayList<Integer> list, int i) {
        int first = list.indexOf(i);
        return first;
    }
}
