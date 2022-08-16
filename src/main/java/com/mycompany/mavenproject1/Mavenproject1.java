/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        SwapNum obj= new SwapNum();
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter 2 numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        obj.swapTwoNum(a,b);     

    }
    
    
}
