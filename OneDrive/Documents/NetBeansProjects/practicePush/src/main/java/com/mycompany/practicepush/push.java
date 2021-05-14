/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicepush;
import java.util.Scanner;

/**
 *
 * @author PfumelaNtsena
 */
public class push {
    public static void main (String[]args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter age");
        int age = scan.nextInt();
        
        System.out.println("Enter name");
        String name = scan.nextLine();
        
        System.out.println("Entered data ");
        System.out.println("Age is: "+ age + " Name is: " + name);
        
    }
    
}
