package com.wang.test06;

public class Test06 {
    public static void main(String[] args) {
//        1. 定义类 Test6
//        2. 定义 main方法
//        3. 定义方法printNum,在main方法中调用printNum方法
        printNum();
//        4. printNum方法中,定义int变量a赋值为9,b也赋值为9
//        5. printNum方法中,定义int变量num赋值为++a.
//        6. printNum方法中,定义boolean变量bo,使用三元运算符赋值,当num>=10,赋值为true,否则为false,打印bo的值
//        7. printNum方法中,定义int变量num2赋值为b++.
//        8. printNum方法中,定义boolean变量bo2,使用三元运算符赋值,当num2>=10,赋值为true,否则为false.打印bo2的值

    }

    //    3. 定义方法printNum,在main方法中调用printNum方法
    public static void printNum() {
//        4. printNum方法中,定义int变量a赋值为9,b也赋值为9
        int a = 9, b = 9;
//        5. printNum方法中,定义int变量num赋值为++a.
        int num = ++a;
//        6. printNum方法中,定义boolean变量bo,使用三元运算符赋值,当num>=10,赋值为true,否则为false,打印bo的值
        boolean bo = (num >= 10 ? true : false);
        System.out.println("num>=10?:" + bo);
//        7. printNum方法中,定义int变量num2赋值为b++.
        int num2 = b++;
//        8. printNum方法中,定义boolean变量bo2,使用三元运算符赋值,当num2>=10,赋值为true,否则为false.打印bo2的值
        boolean bo2=(num2>=10?true:false);
        System.out.println("num2>=10?:"+bo2);

    }
}
