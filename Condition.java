package com.trimindtech.training.day02;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        x=sc.nextInt();
        System.out.println((x%2 == 0?"even":"odd"));
    }
}
