/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flying_boat;

/**
 *
 * @author mashaal
 */
public class MyFlyingBoat implements Flying_Boat {
    
    public void Fly(){
        
        System.out.println("Boat is Flying");
        
    }
    
    public void Swim(){
        
        System.out.println("Boat is Swimming");
        
    }
    
 
    public void SwimAndFly(){
        
        
    Fly();
    Swim();
         
        
    }
    
    
}
