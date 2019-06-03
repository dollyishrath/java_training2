package com.trimindtech.training.day02;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        int i,j,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower limit");
        i = sc.nextInt();
        System.out.println("enter the upper limit");
        j = sc.nextInt();
        System.out.println("the number is in between the entered numbers");
        while(i<=100){
            System.out.println(i);
            i++;
        }
    }
}
