/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener.*;
/**
 *
 * @author Dipesh
 */
class BorderDemo extends JFrame{
    JButton b1,b2,b3,b4,b5;
    public void setBorder(){
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        b5 = new JButton("Center");
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(400,400);
        setDefaultCloseOperation(3);
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
    }
}


public class BorderLayoutDemo {
    public static void main(String[] args){
        BorderDemo borderdemo = new BorderDemo();
        borderdemo.setBorder();
    }
}
