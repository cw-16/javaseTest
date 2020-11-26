package com.wang.test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        //定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
        // 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）

        Collection<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);

        Object[] objects = list.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]+" ");
        }
    }
}
