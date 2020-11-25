package com.wang.test02;

public class Test02 {
    public static void main(String[] args) {
//        1. 定义类 Test2,类中定义 main方法
//        13. 调用doCheck方法,传入2,保存返回值,并输出
        boolean b = doCheck(2);
        System.out.println(b);

        System.out.println("==========");

//        14. 调用doCheck方法,传入3,保存返回值,并输出
        boolean b1 = doCheck(3);
        System.out.println(b1);
    }


    //        2. 定义doCheck方法,参数为(int iVar),返回值boolean类型
    public static boolean doCheck(int iVar) {
        //3. doCheck方法内,定义变量boolean flag.
        boolean flag;
        //4. doCheck方法内,判断num是否为偶数.
        if (iVar % 2 == 0) {
            //5. 如果是偶数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
            for (int i = 0; i <= 20; i++) {
                //6. 循环内,num-=i;
                iVar -= i;
            }
            //flag赋值为true.
            flag = true;
        } else {
            //否则是奇数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
            for (int i = 0; i <= 20; i++) {
                // 循环内,num+=i;
                iVar += i;
            }
            flag = false;
        }

        System.out.println(iVar);

        return flag;
    }
}
