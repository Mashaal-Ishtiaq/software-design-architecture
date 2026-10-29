/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentregistration;

/**
 *
 * @author mashaal
 */
public class Controller {
    
    private Student model;
    private View view;
    
    public Controller(Student model, View view){
        this.model = model;
        this.view = view;
    }
    public void setStudent(){
        String []data = view.collectInfo();
        model.setName(data[0]);
        model.setFather(data[1]);
        model.setRollNo(data[2]);
        model.setGender(data[3]);
        model.setContactNo(data[4]);
        model.setEmail(data[5]);
        model.setAddress(data[6]);
    }
    public String getStudentName(){
        return model.getName();
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }
    
     public String getFather() {
        return model.getFather();
    }
     
     public String getContactNo() {
        return model.getContactNo();
    } 
     
     public String getGender() {
        return model.getGender();
    } 
    
      public String getEmail() {
        return model.getEmail();
    }
      
    public String getAddress() {
        return model.getAddress();
    }  
     
     
    public void updateView(){
        view.txtName.setText(model.getName());
        view.txtFather.setText(model.getFather());
        view.cbGender.setSelectedItem(model.getGender());
        view.txtContact.setText(model.getContactNo());
        view.txtRollNo.setText(model.getRollNo());
        view.txtEmail.setText(model.getEmail());
        view.txtAddress.setText(model.getAddress());
        view.printStudentDetails(model.getName(), model.getFather(),model.getGender() , model.getContactNo() ,  model.getRollNo() ,model.getEmail() ,model.getAddress());
    }
    
}
