package com.tamu.jo.utils;

public class CalcDemo {
    public static void main(String[] args) {
        CalcDemo demo = new CalcDemo();
        System.out.println(demo.sum(5, -1));
    }

    /**
     * @author Abu Shaira
     * @date 25 Mar 2018
     * @desc a function that sums up two integers.
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
