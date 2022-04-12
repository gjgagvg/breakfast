package com.yuze.hello;
import java.util.Scanner;
public class sean {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输出购票时间");
        int season = myscanner.nextInt();

        if (season < 4 && season > 10) {
            System.out.println("请输出你的年龄");
            int age = myscanner.nextInt();
        if (age < 18 && age > 60) {
            System.out.println("你的票价为60");
        } else {
            System.out.println("你的票价为20");
        }

    }

        System.out.println("请输出你的年龄");
        int age = myscanner.nextInt();
        if (age > 18) {
            System.out.println("你的票价为30");

        }else if (age<60){
            System.out.println("你的票价为20");
            }else{
            System.out.println("你的学费为60");
        }


        }

    }