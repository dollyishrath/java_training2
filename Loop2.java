package com.trimindtech.training.day02;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        double i,n=0.01,sum=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            i = sc.nextDouble();
            while(n<=i){
                sum = sum + n;
                n = n + 0.01;
            }
            System.out.println("the sum value is" + sum);
    }
}
