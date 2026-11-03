/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wix1002a1103;

/**
 * @author 27006
 */
public class T4Q2b {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        // 原错误：while (x < 100) 后面缺分号
        // 改正：加 ;
        do {
            x += 2;
            y += x;
            System.out.println(x + " and " + y);
        } while (x < 100);       // ← 这里必须有分号
    }
}
