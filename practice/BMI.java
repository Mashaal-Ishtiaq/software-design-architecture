/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bmi;

import java.util.Scanner;
import static javax.swing.Spring.height;

/**
 *
 * @author mashaal
 */
public class BMI {

    public static void main(String[] args) {
        
         System.out.println("___BMI CALCULATION___");
       
        
        Scanner sc= new Scanner(System.in);
        
        float weight;
        float height_cm;
        float height_m;
        float bmi;
        
         System.out.println("Enter your weight in kg"); 
         weight = sc.nextFloat();
         
         System.out.println("Enter your height in cm"); 
         height_cm = sc.nextFloat();
         
         
              height_m= height_cm/100;
            
            bmi=weight/(height_m * height_m);
            
            
             
              System.out.println("Your BMI is: "+bmi); 
          
         if(bmi <= 18.5)   {
             
              System.out.println("underweight"); 
         }
         else if(bmi>=18.5 || bmi<=24.9){
             
              System.out.println("Normal weight"); 
         } 
         
         else if(bmi>=25 || bmi<=29.9){
             
              System.out.println("overweight weight"); 
         } 
         else if(bmi>=30) {
             
              if(bmi>=18.5 || bmi<=24.9){
             
              System.out.println("obesity"); 
         } 
         }
        
    }
}
