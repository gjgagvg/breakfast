package com.yuze.hello;
import java.util.Scanner;
import java.util.Scanner;
public class sean01 {
    public static void main(String[] args) {
       Scanner  myscanner=new Scanner(System.in);
        System.out.println("请输入月份");
       int season= myscanner.nextInt();
        System.out.println("请输入你的年龄");
       int age=myscanner.nextInt();
       if (season>=4&&season<=10){
           if (age<=60&&age>=18){
               System.out.println("你的票价为60");
           }else if(age>60){
               System.out.println("你的票价为"+60/3);
           }
           else{
            System.out.println("你的票价为"+60/2);
           }

       }
       else {
           if (age <= 60 && age >= 18) {
               System.out.println("你的票价为40");
           } else {
               System.out.println("你的票价为20");
           }

       }


    }
}
