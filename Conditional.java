package com.trimindtech.training.day02;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x value");
        x=sc.nextInt();
        System.out.println("enter y value");
        y=sc.nextInt();
        int greater=(x>y)?x:y;
        System.out.println("greater");
    }
}
