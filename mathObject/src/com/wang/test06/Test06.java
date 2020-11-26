package com.wang.test06;



import java.util.ArrayList;
import java.util.Iterator;


public class Test06 {
    public static void main(String[] args) {
//      筛选字符串。
//
//* 定义ArrayList集合，存入多个字符串。
//* 长度大于5的字符串，打印删除后的集合。

        ArrayList<String> list=new ArrayList<>();
        list.add("who");
        list.add("1234");
        list.add("123");
        list.add("123456");
        list.add("abcdef");
        list.add("love");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length()>5){
                list.remove(i);
                i--;
            }
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(list.size());





    }

}
