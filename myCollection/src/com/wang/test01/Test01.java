package com.wang.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
       //给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，如"a": 2,"b": 2,"c" :1, "xxx":0。;
        Collection<String> list=new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        System.out.println("a:"+listTest(list,"a"));
        System.out.println("b:"+listTest(list,"b"));
        System.out.println("c:"+listTest(list,"c"));
        System.out.println("xxx:"+listTest(list,"xxx"));
    }

    private static int listTest(Collection<String> list, String str) {
        int count=0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (str.equals(iterator.next())){
                count++;
            }
        }
        return count;
    }
}
