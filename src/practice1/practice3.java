/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class practice3 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     
         float total = 0;
        System.out.print("Enter number of product: ");
        int npro = sc.nextInt();
        for (int i = 1; i <= npro;i++){
            System.out.print("Enter price for product: ");
        int ppro = sc.nextInt();
        total += ppro;
        }
        
        System.out.println("Total Due: "+ total);
        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println(" ");
        System.out.print("Enter Cash: ");
        int cash = sc.nextInt();
        while (cash < total) {
            System.out.print("pls try again, Enter cash amount: ");
            cash = sc.nextInt();
        }
        
       float change = cash - total;
       
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println(" RECEIPT");
        System.out.println("-------------------");
        System.out.println(" ");
        System.out.println("Number of Product: "+npro);
        System.out.println("TOTAL DUE: PHP "+ total);
        System.out.println("cash Received: PHP "+ cash);
        System.out.println("CHANGE: PHP: "+ change);
}
}