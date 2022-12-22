/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener.*;
/**
 *
 * @author Dipesh
 */

class GridDemo extends JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public void setBorder(){
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        b5 = new JButton("Button5");
        b6 = new JButton("Button6");
        setVisible(true);
        setLayout(new GridLayout(3,2)); //two row three column
        setSize(400,400);
        setDefaultCloseOperation(3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);  
    }
    
}
public class GridLayoutDemo {
    public static void main(String[] args){
       GridDemo griddemo = new GridDemo();
       griddemo.setBorder();
    }
}
