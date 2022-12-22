/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener.*;

class Menuexample extends JFrame{
    JMenuBar b1;
    JMenu m1,m2,m3;
    JMenuItem f1,f2,f3;
    JMenuItem e1,e2,e3;
    JMenuItem v1,v2,v3;
    
    public void setMenu(){
        b1 = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        f1 = new JMenu("New");
        f2 = new JMenu("New Window");
        f3 = new JMenu("Open");
        e1 = new JMenuItem("Copy");
        e2 = new JMenuItem("Cut");
        e3 = new JMenuItem("Paste");
        v1 = new JMenuItem("Zoom");
        v2 = new JMenuItem("Status");
        v3 = new JMenuItem("Cancel");
        
        m1.add(f1); m1.add(f2); m1.add(f3);
        m2.add(e1); m2.add(e2); m2.add(e3);
        m3.add(v1); m3.add(v2); m3.add(v3);
        
        b1.add(m1);
        b1.add(m2);
        b1.add(m3);
        
        add(b1);
        
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout(FlowLayout.LEFT,25,20));
        setDefaultCloseOperation(3);
        //addinng menu to menufar
        
    }
    
    
}



/**
 *
 * @author Dipesh
 */
public class MenuProgram {
 public static void main(String[] args){
     Menuexample m1 = new Menuexample();
     m1.setMenu();
 }   
}
