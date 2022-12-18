

package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
class Combo extends JFrame{
    JComboBox j1;
    JLabel l1,l2;
    JList j2;
    JTable tb1;
    public void setCombo(){
        String country []={"Nepal","USA","China"};
   String courses []={"BIM","BCA","CSIT","BBM","BHM","BBS","BBA","BA","BSC","MSC"};
   //for table header
       String [] header={"id","name","gender","faculty","grade"};
       String [][]data = {
           {"1","ram","male","csit","A+"},
           {"1","ram","male","csit","A+"},
           {"1","ram","male","csit","A+"},
           {"1","ram","male","csit","A+"},
           {"1","ram","male","csit","A+"},
           {"1","ram","male","csit","A+"},
           {"1","ram","male","csit","A+"},
           {"1","ram","male","csit","A+"},
       };
    j1 = new JComboBox(country);
        l1 = new JLabel("Result");
        l2 = new JLabel("Result for list");
        j2 = new JList(courses);
        tb1 = new JTable(data,header);
        tb1.setPreferredScrollableViewportSize(new Dimension (250,100));
        //to insert scroll bar
        JScrollPane scroll = new JScrollPane(j2);
        JScrollPane sc1 = new JScrollPane(tb1);
        add(sc1);
        add(j1);
        add(l1);
        add(l2);
        
        add(scroll);
        //for multiple selection
        //0"->single selection, 1->single selection interval
        //2-> multiple selection
        j2.setSelectionMode(2);
        //combo box throw two event: actionevent and itemevent
        j1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
               // throw new UvcnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                 String country = (String)j1.getSelectedItem();
                 l1.setText("your country is "+country);
            }  
        });
        //event hanlding for JList
        //listselectionevent
        
        j2.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
             String str="";
                ArrayList <String> st = (ArrayList)j2.getSelectedValuesList();
             for(String var:st){
                 str+=var+",";
                 
             }
             l2.setText("your courses are "+str);
            }
            
        });
     
                
    setVisible(true);
    setSize(500,500);
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
