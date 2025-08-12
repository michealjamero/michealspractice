
package practice1;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
    int math, science,english,computer,totalm;
    String name;
    float totalav;
    
        System.out.print("Enter your full name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks Here: ");
        System.out.print("Math: ");
        math = sc.nextInt();
        System.out.print("Science: ");
        science = sc.nextInt();
        System.out.print("english: ");
        english = sc.nextInt();
        System.out.print("computer: ");
        computer = sc.nextInt();
        
        totalm = math+science+english+computer;
        totalav = totalm / 4;
        
        
        System.out.println("------------------------");
        System.out.println("Grade Details");
        System.out.println("------------------------");
        System.out.println("Name: "+ name);
        System.out.println("Total marks: "+ totalm );
        System.out.println("total evarege: "+ totalav );
        
    
        
        
    }
    
}

    
    
