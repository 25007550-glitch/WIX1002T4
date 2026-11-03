package com.mycompany.wix1002a1103;

import java.util.Scanner;

/**
 *
 * @author 27006
 */
public class T4Q1d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int given = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= given; i++) {
            sum += i;
        }

        System.out.println("Sum from 1 to " + given + " = " + sum);

        sc.close();
    }
}
