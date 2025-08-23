/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class practice4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int km,clas;
        double total=0;
        
        System.out.println("Class 1:Economy Class");
        System.out.println("Class 2:Economy Class");
        
        System.out.print("distance(km): ");
        km = sc.nextInt();
        System.out.print("Class: ");
        clas = sc.nextInt();
        
        if (clas == 1){
           total = km * 250;
        }else if (clas == 2){
            total = km * 500;
        }
        
        if (km > 1000){
            total *=0.9;
        }
        
        System.out.println("total fare: "+ total);
            
        
        
    }
    }

