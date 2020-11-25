package com.wang.test01;

public class Test01 {
    public static void main(String[] args) {
//        1. 定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
        int a = 10, b = 10;

//        5. main方法中,调用printNum方法,传入a,b
        printNum(a, b); //10;10
        System.out.println("=============");
//        6. main方法中,调用doubling方法,传入a,b
        doubling(a, b);//20;20
        System.out.println("=============");

//        7. main方法中,调用printNum方法,传入a,b
//        printNum(a, b);//10;10
        System.out.println("=============");

//        8. main方法中,调用doubling方法,传入a,用a接收返回值
        a = doubling(a);
//        9. main方法中,调用doubling方法,传入b,用b接收返回值
        b = doubling(b);
//        10. main方法中,调用printNum方法,传入a,b
        printNum(a,b);//10;10
    }

    //        2. 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
    private static void printNum(int iVar, int iVar2) {
        System.out.println(iVar + ";" + iVar2);
    }

    //        3. 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,
//           并调用printNum方法,输出r和p的值
    private static void doubling(int r, int p) {
        r = 2 * r;
        p = 2 * p;
        printNum(r, p);
    }

    //        4. 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
    private static int doubling(int r) {
        return 2 * r;
    }
}
