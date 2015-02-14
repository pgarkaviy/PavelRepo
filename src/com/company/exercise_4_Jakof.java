package com.company;

/**
 * Created by user on 1/19/15.
 */
public class exercise_4_Jakof {
    public static void main(String[] args){
        String str = "one";
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.toCharArray()[str.length()-i]);
        }
    }
}

