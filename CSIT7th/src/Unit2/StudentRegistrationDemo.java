/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class StudentRegistration extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    JButton b1;
    public void setRegistration(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l3=new JLabel("Repassword");
        l4=new JLabel("Gender");
        l5=new JLabel("Course");
        l6=new JLabel("Result");
        
        t1=new JTextField(30);
        
        p1=new JPasswordField(30);
        p2=new JPasswordField(30);
        
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        
        c1=new JCheckBox("C");
        c2=new JCheckBox("C++");
        c3=new JCheckBox("Java");
        
        b1=new JButton("Submit");
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
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
       add(l6);
       add(b1);
        
       b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String res="";
                res += "your username is " +t1.getText()+"your password is"+p1.getText()+"your repassword is"+p2.getText()
                        +"your gender is";
                if(r1.isSelected()){
                    res+=r1.getText();
                }else{
                    res+=r2.getText();
                }
                res+="your courses are:";
                if(c1.isSelected()){
                res+=c1.getText();
                }
                if(c2.isSelected()){
                res+=c2.getText();
                }
                if(c3.isSelected()){
                res+=c3.getText();
                }
            
            }
        
        });
    
       setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    
}
public class StudentRegistrationDemo {
    public static void main(String[] args) {
        StudentRegistration sr=new StudentRegistration();
        sr.setRegistration();
        
    }
        
}
