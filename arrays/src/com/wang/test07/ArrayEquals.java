package com.wang.test07;

public class ArrayEquals {
    public static void main(String[] args) {
//        定义equals方法，比较数组内容是否完全一致。
        String[] str1 = {"a", "b", "c", "d"};
        String[] str2 = {"a", "b", "c", "d"};
        String[] str3 = {"a", "b", "b", "d"};
        String[] str4 = {"a", "b", "d"};

        equals(str1, str2);
        equals(str1, str3);
        equals(str1, str4);

    }

    private static void equals(String[] str1, String[] str2) {
        boolean flag = true;
        if (str1.length == str2.length) {
            for (int i = 0; i < str1.length; i++) {
                if (!str1[i].equals(str2[i])) {
                    flag = false;
                }
            }
            if (flag){
                System.out.println("两数组相等");
            }else {
                System.out.println("两数组不相等");
            }
        } else {
            System.out.println("两数组不相等");


        }
    }
}

