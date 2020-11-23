package com.wang.test02;

public class Test02 {
    public static void main(String[] args) {
//        1. 定义类 Test2
//        2. 定义 main方法
//        3. 定义 int类型变量i1 和 long类型变量l1
        int i1=100;
        long l1=200;
//        4. 定义变量add,保存i1和l1的和,并输出.
        int add =(int) (i1+l1);
        System.out.println(add);
        System.out.println("============");
//        5. 定义 long类型变量l2 和 float类型变量f2
        long l2=300;
        float f2=100.2f;
//        6. 定义变量add2,保存l2和f2的和,并输出.
        float add2=l2+f2;
        System.out.println(add2);
        System.out.println("============");

//        7. 定义 int类型变量i3 和 double类型变量d3
        int i3=100;
        double d3=200.5;
//        8. 定义变量add3,保存i3和d3的和,并输出.
        double add3=i3+d3;
        System.out.println(add3);
        System.out.println("============");

//        9. 定义 float类型变量f4 和 double类型变量d4
        float f4=100.3f;
        double d4=100.45;
//        10. 定义变量add4,保存f4和d4的和,并输出.
        float add4=(float)(f4+d4);
        System.out.println(add4);
    }
}
