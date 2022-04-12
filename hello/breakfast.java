package com.yuze.hello;

public class breakfast {
    public static void main(String[]args){

        //测试代码
        for (int i=0;i<10;i++) {
            if(i==3){
            break;
            }
            System.out.println("i="+i);
        }

        //break 练习
        //思路分析  先循环1-100求sum
        //当sum>20时,记录下当时的数，然后break
        int sum=0;
        for (int i=1;i<=100;i++) {
            sum+=i;
            if (sum>20) {
                System.out.println("和>20时候，当前数i="+i);
                    break;
            }
        }





    }

















}
