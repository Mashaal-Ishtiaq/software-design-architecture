/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentregistration;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author mashaal
 */


public class View extends JFrame{
    private JPanel contentPane;
    JTextField txtName;
    JTextField txtFather;
    JComboBox cbGender;
    JTextField txtContact;
    JTextField txtRollNo;
    JTextField txtEmail;
    JTextArea txtAddress;
    private JButton btSubmit;
    
    
    //trial
    
    
    private JPanel jPanel1;
private JLabel lblName;
private JLabel lblFather;
private JLabel lblGender;
private JLabel lblContact;
private JLabel lblRollNo;
private JLabel lblEmail;
private JLabel lblAddress;


    public View(){
        
    initComponents(); // Initialize the GUI components

    setLayout(new BorderLayout()); // Set the layout manager
                 Component jPanel1 = null;

             // Add the components to the frame
             add(jPanel1, BorderLayout.CENTER);
               Component btnSubmit = null;
             add(btnSubmit, BorderLayout.SOUTH);

            txtRollNo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if(txtRollNo.getText().isEmpty())
                    txtEmail.setText("");
                else{
                    String rollno = txtRollNo.getText();
                    String []r = rollno.toUpperCase().split("P-");
                    String email = "p"+r[0]+r[1]+"@pwr.nu.edu.pk";
                    txtEmail.setText(email);
                }
            }
        });
        setContentPane(contentPane);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setTitle("Student's Registration");
        setLocationRelativeTo(null);
        setVisible(true);
        
        btSubmit.addActionListener((ActionEvent e) -> {
            collectInfo();
            controller.setStudent();
            controller.updateView();
    });
        
          
    
    }
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
        
    }

     public String[] collectInfo(){
        String name = txtName.getText();
        String father = txtFather.getText();
        String gender = cbGender.getSelectedItem().toString();
        String contact = txtContact.getText();
        String rollno = txtRollNo.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        
        model.setName(txtName.getText());
        model.setFather(txtFather.getText());
        model.setGender(cbGender.getSelectedItem().toString());
        model.setContactNo(txtContact.getText());
        model.setRollNo(txtRollNo.getText());
        model.setEmail(txtEmail.getText());
        model.setAddress(txtAddress.getText());

        //JOptionPane.showMessageDialog(contentPane, "Name: "+name+"\nFather's Name: "+father+"\nGender: "+gender);
        //System.out.println("Name: "+name+"\nFather's Name: "+father+"\nGender: "+gender);
        String []Data = new String[7];
        Data[0] = JOptionPane.showInputDialog("Student's Name: ");
        Data[1] = JOptionPane.showInputDialog("Student's Father Name: ");
        Data[2] = JOptionPane.showInputDialog("Student's Roll No: ");
        Data[3] = JOptionPane.showInputDialog("Student's gender: ");
        Data[4] = JOptionPane.showInputDialog("Student's Contact: ");
        Data[5] = JOptionPane.showInputDialog("Student's Email: ");
        Data[6] = JOptionPane.showInputDialog("Student's Address: ");
        
        return Data;
        
        
    }
   
    public void printStudentDetails(String name , String father , String gender , String contact ,String rollno ,String email, String address ){
        System.out.println("Student: ");
        System.out.println("Name: " + name);
        System.out.println("Father Name: " +father );
        System.out.println("Roll No: " + rollno);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Info: " + contact);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args){
      // View r = new View();
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            Student model = new Student();
            View view = new View(new Controller(model, view));
            view.setVisible(true);
        }
    });
    }
 
//    private void initComponents() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//        
//    }
    
    
    //trial below
    private void initComponents() {
    jPanel1 = new JPanel();
    lblName = new JLabel();
    lblFather = new JLabel();
    lblGender = new JLabel();
    lblContact = new JLabel();
    lblRollNo = new JLabel();
    lblEmail = new JLabel();
    lblAddress = new JLabel();
    txtName = new JTextField();
    txtFather = new JTextField();
    cbGender = new JComboBox();
    txtContact = new JTextField();
    txtRollNo = new JTextField();
    txtEmail = new JTextField();
    txtAddress = new JTextArea();
    btSubmit = new JButton();

    // Set up the layout
    jPanel1.setLayout(new GridLayout(8, 2));

    // Add the components to the panel
    jPanel1.add(lblName);
    jPanel1.add(txtName);
    jPanel1.add(lblFather);
    jPanel1.add(txtFather);
    jPanel1.add(lblGender);
    jPanel1.add(cbGender);
    jPanel1.add(lblContact);
    jPanel1.add(txtContact);
    jPanel1.add(lblRollNo);
    jPanel1.add(txtRollNo);
    jPanel1.add(lblEmail);
    jPanel1.add(txtEmail);
    jPanel1.add(lblAddress);
    jPanel1.add(txtAddress);
    jPanel1.add(btSubmit);

    // Set up the labels
    lblName.setText("Name:");
    lblFather.setText("Father's Name:");
    lblGender.setText("Gender:");
    lblContact.setText("Contact No:");
    lblRollNo.setText("Roll No:");
    lblEmail.setText("Email:");
    lblAddress.setText("Address:");

    // Set up the text fields
    txtName.setColumns(20);
    txtFather.setColumns(20);
    txtContact.setColumns(20);
    txtRollNo.setColumns(20);
    txtEmail.setColumns(20);

    // Set up the combo box
    cbGender.addItem("Male");
    cbGender.addItem("Female");

    // Set up the button
    btSubmit.setText("Submit");
}
}


