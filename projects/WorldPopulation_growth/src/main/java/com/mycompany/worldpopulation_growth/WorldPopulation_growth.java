/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.worldpopulation_growth;
import  java.util.Scanner;
/**
 *
 * @author mashaal
 */
public class WorldPopulation_growth {
    
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("___WORLD POPULATION GROWTH CALCULATOR____");
        System.out.println(" Choose (1 or 2) 1.Enter the standard world population 2.Enter population yourself");
        
        int choice;
        
         choice= sc.nextInt();
         
         if(choice == 1){
             long population=8019876189L;
             double rate=0.91;
             
             
               System.out.println("standard population: "+population);
                System.out.println("standard rate: "+rate);
             
             double res=(double)population*(rate+1);
             
            
             
             System.out.println("World population after 1st year :"+res);
             
                res=(double)res*(rate+1);
             
             System.out.println("World population after 2nd year :"+res);
             
                res=(double)res*(rate+1);
             
             System.out.println("World population 3rd year :"+res);
             
             
                res=(double)res*(rate+1);
             
             System.out.println("World population 4th year :"+res);
             
             res=(double)res*(rate+1);
             
             System.out.println("World population 5th year :"+res);
            
             
         }
         else if(choice == 2){
             
             float population;
             float rate;
             
             System.out.println("Enter population");
             population=sc.nextFloat();
             
              System.out.println("Enter growth rate");
             rate=sc.nextFloat();
             
             double res=(double)population*(rate+1);
             
            
             
             System.out.println("World population after 1st year :"+res);
             
                res=res*(rate+1);
             
             System.out.println("World population after 2nd year :"+res);
             
                res=res*(rate+1);
             
             System.out.println("World population 3rd year :"+res);
             
             
                res=res*(rate+1);
             
             System.out.println("World population 4th year :"+res);
             
             res=res*(rate+1);
             
             System.out.println("World population 5th year :"+res);
            
             
         }
         else{
             System.out.println("invalid input");
         }
        
    }
}
