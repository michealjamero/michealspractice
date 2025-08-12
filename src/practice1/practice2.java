
package practice1;

import java.util.Scanner;

public class practice2 {
   {
    Scanner sc = new Scanner(System.in);
    
    int price,qua;
    String name;
    int money;
    
        System.out.print("Enter Product Name: ");
        name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        price = sc.nextInt();
        System.out.print("Enter Product Quantity: ");
        qua = sc.nextInt();
        
        float Due = price * qua;
        System.out.println("----------------------");
        System.out.println("PURCHASE DETAILS");
        System.out.println("----------------------");
        System.out.println("Product name: "+ name);
        System.out.println(" ");
        System.out.println("total Due: "+ Due );
        System.out.println("---------------------");
        System.out.println("");
        System.out.print("Enter Cash From Customer: ");
        money = sc.nextInt();
        System.out.println(" ");
        float change = money - Due;
        System.out.println("--------------------");
        System.out.println("CHANGE: "+ change );
        System.out.println("--------------------");
    }
}
