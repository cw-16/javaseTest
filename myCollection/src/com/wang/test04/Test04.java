package com.wang.test04;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        //定义一个方法listTest(ArrayList<String> al, String s),
        // 要求使用contains()方法判断al集合里面是否包含s。

        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");

        listTest(list, "cc");
        listTest(list, "pp");
    }

    private static void listTest(ArrayList<String> al, String s) {
        if (al.contains(s)) {
            System.out.println("list包含" + s);
        } else {
            System.out.println("list不包含" + s);
        }
    }
}
