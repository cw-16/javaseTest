package com.wang.test04;



import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //替换某字符串中的某字符串。
        //
        //* 键盘录入一个srcStr字符串，再录入一个delStr字符串。
        //* 删除该字srcStr符串中的所有delStr字符串。
        Scanner sc = new Scanner(System.in);

        String srcStr = sc.next();
        String delStr = sc.next();

        int count = delStr(srcStr, delStr);

        System.out.println(count+"次;删后："+srcStr.replace(delStr,""));


    }

    private static int delStr(String srcStr, String delStr) {
        int index=0;
        int count=0;

        while ((index=srcStr.indexOf(delStr,index))!=-1){
            index++;
            count++;
        }


        return count;
    }

}
