
package unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Form_Swing extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1, r2;
    JButton b1, b2;
    JComboBox c1;
    String s1[] = { "Nepal", "India", "Pakistan", "USA", "Russia" };
    
    public void setForm(){
        l1 = new JLabel("Username");
        t1 = new JTextField(30);
        l2 = new JLabel("Password");
        p1 = new JPasswordField(30);
        l3 = new JLabel("Re-Password");
        p2 = new JPasswordField(30);
        l4 = new JLabel("Gender");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l5 = new JLabel("Country");
        c1 = new JComboBox(s1);
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(p1);
        add(p2);
        add(r1);
        add(r2);
        add(c1);
        
      b1.addActionListener(new ActionListener(){
          @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                Connection conn;
                try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/db_nccs_b";
                String username = "root";
                String password = "";
                conn =DriverManager.getConnection(url, username, password);
                System.out.println("Connected");
                }
                catch(Exception ex){

                }
            }
      });
      
      b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
      });
      
        
        
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    
}
