/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentregistration;

/**
 *
 * @author mashaal
 */
public class Student {
    
     private String name ;
     private String father ;
     private String gender ;
     private String contact ;
     private String rollno ;
     private String email ;
     private String address ;
        
        
   
 
    public String getRollNo() {
        return rollno;
    }
    public void setRollNo(String rollNo) {
        this.rollno = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFather() {
        return father;
    }
    public void setFather(String father) {
        this.father = father;
    }
    
    public String getContactNo() {
        return contact;
    }
    public void setContactNo(String contact) {
        this.contact = contact;
    }
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
     public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
