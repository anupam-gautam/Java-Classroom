
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseExample extends JFrame{
    JTextField t1;
    JLabel l1;
    public void setMouse(){
        t1=new JTextField(30);
        l1 = new JLabel("Result");
        add(t1);
        add(l1);
        //handling mouse event
        t1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    
                l1.setText("mouse is clicked at "+e.getX()+","+
                        e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody


               l1.setText("mouse is pressed at "+e.getX()+","+
                       e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
             l1.setText("mouse is released at "+e.getX()+","+
                        e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            l1.setText("mouse is clicked at "+e.getX()+","+
//                        e.getY());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        setVisible(true);
        setSize(200,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
}
public class MouseEventDemo {
    public static void main(String[] args) {
        MouseExample m = new MouseExample();
        m.setMouse();
    }
  
}
