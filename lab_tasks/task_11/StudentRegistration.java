/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentregistration;

import javax.swing.SwingUtilities;

/**
 *
 * @author mashaal
 */

//main class
public class StudentRegistration {
    
  
    
    private void createGUI() {
    Student model = new Student();
    View view = new View();
    Controller controller = new Controller(model, view);
    controller.setStudent();
    controller.updateView();
    
    // Add the view to the frame
    add(view);

    // Set the frame visible
    setVisible(true);
}

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        StudentRegistration studentRegistration = new StudentRegistration();
        studentRegistration.createGUI();
    });
    }

    private void add(View view) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
