/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wix1002a1103;

/**
 *
 * @author 27006
 */


/**
 *
 * @author 27006
 */
public class T4Q1e {

    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 25; i++) {
            sum += (double) i / (26 - i);
        }

        System.out.printf("Sum = %.2f%n", sum);
    }
}

