/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstlabjava;
import java.util.Scanner; 

/**
 *
 * @author mashaal
 */
public class FirstLabJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        String firstName;
        String lastName;
                
        Scanner sc=new Scanner(System.in); 
         System.out.println("Enter your name:");
        firstName = sc.nextLine();
        
         System.out.println("Enter your last name:");
          lastName = sc.nextLine();
          
          String fullName=firstName+" "+lastName;
          System.out.println("Full Name: "+fullName);
          
          if(firstName.equals(lastName)){
               System.out.println("same value");
          }
          else{
               System.out.println("not the same value  ");
          }
//        
//        int a;
//        int b;
    //    char c;
        
       // Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a value for A:");
//                    a=sc.nextInt();
//                    
//         System.out.println("Enter a value for B:");
//                    b=sc.nextInt();  
//                    
//          System.out.println("Enter operator:");
//                    c=sc.next().charAt(0);    
//                    
//                    
//          if(c=='+'){
//               int sum = a+b;
//            
//                System.out.println("Sum is:"+sum);
//          }  
//          else
//          {
//             System.out.println("Invalid operator");
//          }
//          
          
         //System.out.println("Welcome to java programming!"+a);
         
         //variables
    }
}
