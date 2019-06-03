package com.trimindtech.training.day02;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        double radius;
        final double PI =22.0/7;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        while(radius>=0)
        {
            System.out.println("enter a positive number");
            Scanner s = new Scanner(System.in);
            radius = sc.nextDouble();

        }
    }
}
