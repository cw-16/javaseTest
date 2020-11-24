package com.wang.test06;

public class Symmetry {
    public static void main(String[] args) {
//        定义sym方法，判断数组中的元素值是否对称.
    int[] arr={1,2,3,2,1};
    int[] arr2={1,2,3,4};
    sym(arr);
    sym(arr2);

    }

    private static void sym(int[] arr) {
        boolean flag=true;;
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                flag=false;
            }
        }
        if(flag){
            System.out.println("该数组为对称数组");
        }else {
            System.out.println("该数组不是对称数组");
        }
    }
}
