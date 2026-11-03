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
 * @author 27006
 */
public class T4Q2a {

    public static void main(String[] args) {
        int x;
        int sum = 0;

        // 原错误：for (x = 10; x > 0; x++)  
        // 条件 x>0 但 x 一直增大，永远成立 → 死循环
        // 改正：x++ 改为 x--
        for (x = 10; x > 0; x--) {
            sum += x;
        }

        System.out.println("Sum = " + sum);
    }
}

