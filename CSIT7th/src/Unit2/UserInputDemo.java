
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class UserInput extends JFrame{//for window
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1;
    public void setComponent(){
        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter second number");
        l3 = new JLabel("Result");
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b1 = new JButton("Add");
        //adding component in window
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        //handing action event
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            //extracting data from textfield
            int num1 = Integer.parseInt(t1.getText());
             int num2 = Integer.parseInt(t2.getText());
             int sum = num1+num2;
             l3.setText("sum is "+sum);
            }
            
            
        });
        //setting properties of window
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class UserInputDemo {
    public static void main(String[] args) {
        UserInput u1 = new UserInput();
        u1.setComponent();
    }
}
