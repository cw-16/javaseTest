package com.wang.test07;


public class Test07 {
    public static void main(String[] args) {
//        1. 定义类 Test7
//        2. 定义 main方法
//        3. 定义方法printNum,在main方法中调用printNum方法
        printNum();

    }

    private static void printNum() {
//        4. printNum方法中,定义float变量f1赋值12345.01
        float f1 = 12345.01f;
//        5. printNum方法中,定义float变量f2赋值12345.00
        float f2=12345.00f;
//        6. printNum方法中,定义float 变量 var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2赋值12456.02
        float var1=(f1>f2?(float) 12456:(float) 12456.02);
//        7. printNum方法中,定义float 变量 var2 , 保存var1 与1024的和.
        float var2=var1+1024;
//        8. printNum方法中,同时输出var1,var2的值.
        System.out.println("var1的值:"+var1+"; var2的值:"+var2);
    }
}
