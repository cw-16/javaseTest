package com.wang.test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //键盘录入学生信息，保存到集合中。
        //
        //* 循环录入的方式，1：表示继续录入，0：表示结束录入。
        //* 定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
        //* 使用ArrayList集合，保存学生对象，录入结束后，遍历集合

        ArrayList<Student> lists=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

       while (true){
           System.out.println("是否继续录入学生信息：1：继续录入，0：结束录入");
           int flag = sc.nextInt();
           if(flag==1){
               System.out.print("请输入姓名：");
               String name = sc.next();
               System.out.print("请输入年龄：");
               int age = sc.nextInt();

               Student student=new Student();
               student.setName(name);
               student.setAge(age);

               lists.add(student);

               System.out.println("学生信息已添加！");
           }else if(flag==0){
               System.out.println("谢谢使用！");
               break;
           }else {
               System.out.println("输入有误，请重新输入指令：");
           }
       }

        System.out.println("所有学生信息为：");
        Iterator<Student> iterator = lists.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }


    }
}
