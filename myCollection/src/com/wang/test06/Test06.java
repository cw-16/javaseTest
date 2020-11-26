package com.wang.test06;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        //定义一个方法listTest(ArrayList<Integer> al, Integer s)，
        // 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");


        listTest(list,"d");
    }

    private static void listTest(ArrayList<String> list, String d) {
        int i = list.indexOf(d);
        System.out.println("第一次出现位置："+i);
    }
}
