
package Unit4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Registration extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1;
    public void setRegistration(){
       
        
        l1 = new JLabel("Username");
        t1 = new JTextField(20);
        l2 = new JLabel("Password");
        t2 = new JTextField(20);
        l3 = new JLabel("Repassword");
        t3 = new JTextField(20);
        l4 = new JLabel("gender");
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        l5 = new JLabel("country");
        String country[]={"Nepal","India","China","Japan","US"};
        c1=new JComboBox(country);
        b1 = new JButton("submit");
        l6 = new JLabel("Result");
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(r1);
        add(r2);
        add(l5);
        add(c1);
        add(b1);
        add(l6);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            String username =t1.getText();
            String password = t2.getText();
            String repassword = t3.getText();
            String gender="";
            if(r1.isSelected()){
                gender+="male";
                
            }else{
                gender+="female";
            }
            String country =(String)c1.getSelectedItem();
            Connection conn;
            try{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/db_nccsb";
String dbusername="root";
String dbpassword="";
conn = DriverManager.getConnection(url,dbusername,dbpassword);

//inserting form's data into tbl_reg
PreparedStatement st = conn.prepareStatement("insert into tbl_reg values(?,?,?,?,?,?)");
st.setInt(1,1);
st.setString(1,username);
st.setString(2,password);
st.setString(3,repassword);
st.setString(4,gender);
st.setString(5, country);
st.execute();
l6.setText("data inserted");

            }catch(ClassNotFoundException c){
                System.out.println(c);
            }catch(SQLException s){
                System.out.println(s);
            }
            }
        
        });
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());  
    }
}
public class Form {
    public static void main(String[] args) {
        Registration rg = new Registration();
        rg.setRegistration();
    }
}
