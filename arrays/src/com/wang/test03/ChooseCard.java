package com.wang.test03;

public class ChooseCard {
    public static void main(String[] args) {
        //*模拟在一副牌中，抽取第1张，第5张，第54张扑克牌。为黑桃A，黑桃5，小王

        String[] color = {"黑桃", "红桃", "梅花", "方块"};//定义数组存放黑红梅方
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int num1 = 1, num2 = 5, num3 = 54;

        CardNumber(color, number, num1);
        CardNumber(color, number, num2);
        CardNumber(color, number, num3);
    }

    private static void CardNumber(String[] color, String[] number, int num) {
        if (num == 53) {
            System.out.println("第" + num + "张牌为: " + "大王");
        }
        if (num == 54) {
            System.out.println("第" + num + "张牌为: " + "小王");
        }
        for (int i = 1; i < color.length + 1; i++) {
            for (int j = 1; j < number.length + 1; j++) {
                if (num == i * j) {
                    System.out.print("第" + num + "张牌为: " + color[i-1] + number[j-1] + " ");
                    break;
                }
            }
        }
    }
}
