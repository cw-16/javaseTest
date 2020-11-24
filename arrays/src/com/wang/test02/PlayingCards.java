package com.wang.test02;

public class PlayingCards {
    public static void main(String[] args) {
        //打印扑克牌
        String[] color={"黑桃","红桃","梅花","方块"};//定义数组存放黑红梅方
        String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                System.out.print(color[i]+number[j]+" ");
            }
            System.out.println();
        }
    }
}
