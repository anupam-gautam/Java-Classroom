/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class JDBC_CRUD {
    public static void main(String[] args){
        Connection conn;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_nccs_b";
            String username = "root";
            String password = "";
            conn =DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            Statement st = conn.createStatement(); //to manipulate query
            
            //query to create table
            //String tbl_query = "CREATE TABLE tbl_emp(id INT PRIMARY KEY,"
                   // + "Name VARCHAR(50)," +
                   // "Address VARCHAR(50),"+
                   // "Gender VARCHAR(50),"+
                   // "Position VARCHAR(50),"+
                   // "Salary VARCHAR(50))";
            
            //String create_query = "INSERT INTO tbl_emp VALUES(4,'Hari', 'Kathmandu', 'Male', 'First','23232')";
            
            //st.execute(tbl_query);
               // System.out.println("Table Created");
                //st.execute(create_query);
                //System.out.println("Data Inserted");
                
                
                //String update_query = "UPDATE tbl_emp SET Name='Sita' Where id=1";
                //st.execute(update_query);
                //System.out.println("Data Updated");
                
                
                
                //String delete_query = "DELETE FROM tbl_emp Where id =1";
                //st.execute(delete_query);
                //System.out.println("Data deleted");
        
        
                String display_query = "SELECT * FROM tbl_emp";
                ResultSet res = st.executeQuery(display_query);
                while(res.next()){
                    String id = res.getString("id");
                    String name = res.getString("Name");
                    String address = res.getString("Address");
                    String position = res.getString("Salary");
                    String salary = res.getString("Salary");
                    String gender = res.getString("Gender");
                    System.out.println(id+" "+name+" "+address+" "+position+" "+salary+" "+gender);
                }        
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
    }
        catch(SQLException e ){
            System.out.println(e);
        }
}
}