package com.yuze.hello;

import java.util.Scanner;

public class Exercise{
 public static void main(String[]args){

     //实现登录验证，有3次机会，如果用户名为“丁真”，密码为666提示登录成功
     //否则提示哈还有几册机会。请用for+break完成
    //创建scanner name；string passwd；保存用户名密码
     //最多循环3次   登录3次  如果满足条件就提起那退出
     //定义一般变量int chance记录还有几次登陆机会
    Scanner myScanner=new Scanner(System.in);
    String name="";
    String passwd="";
    int chance=3;
    for (int i=1 ;i<=3;i++){
        System.out.println("请输入名字");
        name=myScanner.next();
        System.out.println("输入密码");
        passwd=myScanner.next();
        //比较输入的名字和密码是否正确
        //补充说明字符串的内容比较使用的方法 equals
        if ("zk".equals(name)&&"5520".equals(passwd)){
            System.out.println("恭喜你，登录成功~");
            break;

        }
        //登录机会就减少一次
        chance--;
        System.out.println("你还有"+chance+"次登录机会");

    }
    }









}
