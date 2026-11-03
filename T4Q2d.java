/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wix1002a1103;

/**
 * @author 27006
 */
public class T4Q2d {

    public static void main(String[] args) {
        int i = 1;

        // 原错误1：i 从未自增 → 死循环
        // 原错误2：条件 i<10 导致 i 永远到不了 10，if(i==10) 永远不成立
        while (i <= 10) {
            if (i == 10) {
                System.out.println("Program End");
            }
            i++;          // ← 补上自增
        }
    }
}

