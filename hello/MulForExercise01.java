 package com.yuze.hello;

import java.util.Scanner;
import java.util.jar.JarEntry;

public class MulForExercise01 {
    public static void main(String[] args) {
        //main方法
        //统计三个班成绩 每个班5名同学
        //求出各班平均分键盘输入
        //思路分析
        //化繁为简
        //先计算一个班 5个学生的成绩 使用for
        //创建scanner 对象然后接受用户输入
        //得到该班级的平均分，定义一个doubel sum把该班级5个学生的成绩累计
        //如果>=60 passNmll
        //创建scanner对象

        //定义变量int passNum=0,当有一个学生成绩>=60,passNum++
        Scanner myScanner = new Scanner(System.in);
        double totalSore=0;
        int passNum=0;//累计及格人数
        int classNum=3;//班级个数
        int stuNum=5;//学生人数
        for (int i = 1; i <= classNum; i++) {//i表示班级
            double sum = 0;//一个班的总分
            for (int j = 1; j <= stuNum; j++) {//j 表示学生
                System.out.println("请数第"+i+"班的第"  +j + "个学生的成绩");
                double score = myScanner.nextDouble();
                if (score >= 60) {
                        passNum++;
                }
                sum += score;//累计
                System.out.println("成绩为" + score);
            }
            //因为sum是5个学生的总成绩
            System.out.println("sum" + sum + "平均分="+(sum/stuNum));
            //把sum累积到totascore
            totalSore+=sum;


        }
        System.out.println("三个班总分="+totalSore+"平均分"+totalSore/(classNum*stuNum));
        System.out.println("及格人数"+passNum);

    }


}








