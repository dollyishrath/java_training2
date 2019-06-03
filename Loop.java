package com.trimindtech.training.day02;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i,sum=0;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        i = sc.nextInt();
        sum=sum+i;
        }
        while(i!=5);
        System.out.println("end");
    }
}
