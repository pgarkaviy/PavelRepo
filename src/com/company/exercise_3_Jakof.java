package com.company;

/**
 * Lecture 3 1/16/15.
 */
public class exercise_3_Jakof {
    public static void main(String[] args){
        int one = 10;
        int two = 20;
        int three = 30;
        System.out.println(sum3(one,two,three));
        System.out.println(d1(one));
        System.out.println(m1(one));
        // Cycles
        // First option
        int b = 0;
        while(true){
            System.out.println(b);
            b = b + 1;
            if(b == 301){
                break;
            }
        }
        // Alternative option
        b = 0;
        while(b <= 300){
            System.out.println(b);
            b = b + 1;
        }
        // Fibonacci
        int v = 1;
        int s = 0;
        int a = 1;
        int b1 = 0;

        while(v <= 40){
            System.out.println(s);
            b1 = a;
            a = s;
            s = a + b1;
            v = v + 1;
        }
    }
    public static int sum3(int num1, int num2, int num3){
        int sum;
        sum = num1 + num2 + num3;
        return sum;
    }
    public static int d1(int num1){
        return num1*num1;
    }
    public static int m1(int num1){
        return -num1;
    }


}