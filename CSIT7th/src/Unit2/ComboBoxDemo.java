

package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Combo extends JFrame{
    JComboBox j1;
    JLabel l1,l2;
    JList j2;
    
    public void setCombo(){
        String country []={"Nepal","USA","China"};
   String courses []={"BIM","BCA","CSIT","BBM","BHM","BBS","BBA","BA","BSC","MSC"};
        j1 = new JComboBox(country);
        l1 = new JLabel("Result");
        l2 = new JLabel("Result for list");
        j2 = new JList(courses);
        //to insert scroll bar
        JScrollPane scroll = new JScrollPane(j2);
        add(j1);
        add(l1);
        add(scroll);
        //for multiple selection
        //0"->single selection, 1->single selection interval
        //2-> multiple selection
        j2.setSelectionMode(2);
        //combo box throw two event: actionevent and itemevent
        j1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                 String country = (String)j1.getSelectedItem();
                 l1.setText("your country is "+country);
            }  
        });
                
    setVisible(true);
    setSize(200,200);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(3);
    }
}
public class ComboBoxDemo {
    public static void main(String[] args) {
        Combo c1 = new Combo();
        c1.setCombo();
    }
}
