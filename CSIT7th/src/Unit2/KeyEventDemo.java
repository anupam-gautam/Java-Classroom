
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyExample extends JFrame{
    JTextField t1;
    JLabel l1;
    public void setKey(){
        t1 = new JTextField(20);
        l1 = new JLabel("result");
        add(t1);
        add(l1);
        
        t1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //l1.setText("key typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("key pressed is "+e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("key realeased is "+e.getKeyChar());
            }
        
            
            
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(3);
    }
}
public class KeyEventDemo {
    public static void main(String[] args) {
        KeyExample k1 = new KeyExample();
        k1.setKey();
    }
    
}
