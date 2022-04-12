package com.yuze.hello;

import java.util.Scanner;

public class Elseif {

    public static void main(String[] agrs) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入该选手分数");

        double scoer = myscanner.nextDouble();
        if (scoer > 8.0) {
            System.out.println("请输入性别");
            char gender = myscanner.next().charAt(0);

            if (gender == '男') {
                System.out.println("恭喜你加入男子组");
            } else if (gender == '女')
            {
                System.out.println("恭喜您加入女子组");
            } else {
                System.out.println("你的性别不能参加比赛");
            }
        } else {





            System.out.println("你被淘汰了");
        }


         //细节  java太细了

    }
}























