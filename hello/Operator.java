package com.yuze.hello;

public class Operator {
    public static void main(String[] args) {
        int days = 169;
        int weeks = days / 7;
        int leftdays = days % 7;
        System.out.println(days + "天 合" + weeks + "星期零" + leftdays + "天");

        //先定义double huashiwendu，华氏转摄氏的公式为
        //根据给出的公式套用计算即可
        //将得到的结果保存到double  sheshi
        //考虑细节5.0与5的曲别
        double Fahrenheit = 50021;
        double Celsius = 5.0 / 9 * (Fahrenheit - 100);

        System.out.println("华氏温度" + Fahrenheit + "对应的摄氏温度" + Celsius);
    }
}