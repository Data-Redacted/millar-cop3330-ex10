package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter price 1" );
        int p1 = scan.nextInt();

        System.out.println( "Enter quantity 1" );
        int q1 = scan.nextInt();

        System.out.println( "Enter price 2" );
        int p2 = scan.nextInt();

        System.out.println( "Enter quantity 2" );
        int q2 = scan.nextInt();

        System.out.println( "Enter price 3" );
        int p3 = scan.nextInt();

        System.out.println( "Enter quantity 3" );
        int q3 = scan.nextInt();

        float tot = p1*q1 + p2*q2 + p3*q3;
        System.out.println( "Subtotal: " + tot);
        double tax = tot*.055;
        System.out.println( "Tax: " + tax);
        double TOT = tot+tax;
        System.out.println( "Total:  " + TOT);
    }
}
