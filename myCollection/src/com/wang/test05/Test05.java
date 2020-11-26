package com.wang.test05;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
//        一、定义一个方法listTest(ArrayList<String> al),
//        要求使用isEmpty()判断al里面是否有元素。
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        ArrayList<Integer> list2=new ArrayList<>();

        listTest(list);
        listTest(list2);
    }

    private static void listTest(ArrayList<Integer> list) {
        if (list.isEmpty()){
            System.out.println("该集合为空");
        }else {
            System.out.println("该集合不为空");
        }
    }
}
