/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        
class Form extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    JButton b1;
    public void setForm(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3 = new JLabel("Repassword");
        l4 = new JLabel("Gender");
        l5=new JLabel("Course");
        l6 = new JLabel("Result");
        t1 = new JTextField(30);
        p1 = new JPasswordField(30);
        p2 = new JPasswordField(30);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("C");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("java");
        b1 = new JButton("Submit");
        //adding components to window
        add(l1);        
        add(t1);
        add(l2);
        add(p1);
        add(l3);
        add(p2);
        add(l4);
        add(r1);
        add(r2);
        add(l5);
        add(c1);
        add(c2);
        add(c3);
        add(b1);
        add(l6);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                String res ="";
                res += "your username is "+t1.getText()+" your password is "+
                        p1.getText() + "your repassword is "+p2.getText()+"your gender is ";
                if(r1.isSelected()){
                    res+=r1.getText();
                }else{
                    res+=r2.getText();
                }
                res+=" your courses are ";
                if(c1.isSelected()){
                    res+=c1.getText();
                }
                if(c2.isSelected()){
                    res+=c2.getText();
                }
                if(c3.isSelected()){
                    res+=c3.getText();
                }
                l6.setText(res);
                        
            }
        
        
        });
        //setting component of window
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
public class UserFormDemo {
    public static void main(String[] args) {
        Form f1 = new Form();
        f1.setForm();
    }
 
}
