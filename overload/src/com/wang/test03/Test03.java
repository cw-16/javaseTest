package com.wang.test03;

public class Test03 {
    public static void main(String[] args) {
//        定义showColor方法，根据英文单词，输出对应的颜色。
        showColor("red");
        showColor("green");
        showColor("blue");
    }

    private static void showColor(String red) {
        switch (red){
            case "red" :
                System.out.println("红色");
                break;
            case "green" :
                System.out.println("绿色");
                break;
            case "blue" :
                System.out.println("蓝色");
                break;
            default:
                System.out.println("I don`t know.");
                break;
        }
    }
}
