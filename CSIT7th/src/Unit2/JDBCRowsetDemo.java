
package Unit4;
import java.sql.*;
import javax.sql.rowset.*;
public class JDBCRowsetDemo {
    public static void main(String[] args) {
        try{
Class.forName("com.mysql.jdbc.Driver");
RowSetFactory rsf = RowSetProvider.newFactory();
JdbcRowSet rs = rsf.createJdbcRowSet();
//creating connection using rowset
rs.setUrl("jdbc:mysql://localhost:3306/db_nccsb");
rs.setUsername("root");
rs.setPassword("");
//retrive operation using rowset
rs.setCommand("select * from tbl_reg");
rs.execute();
//fetching the value of 1st row
rs.absolute(1);//points first
String id = String.valueOf(rs.getInt("id"));
String name =rs.getString("username");
String pass =rs.getString("password");
String repass = rs.getString("repassword");
String gender = rs.getString("gender");
String country = rs.getString("country");
System.out.println("id is "+id+"name is "+name+
        "pass is "+pass+"repass is "+repass+
        "gender is "+gender+"country is "+country);
//insertin new data using rowset
//rs.moveToInsertRow();//indicating inserting a row
//rs.updateInt("id",2);
//rs.updateString("username","sita");
//rs.updateString("password","abcde");
//rs.updateString("repassword","abcde");
//rs.updateString("gender","female");
//rs.updateString("country","usa");
//rs.insertRow();//excuting insert command
            System.out.println("inserted");
//updating username and country of 2nd row
rs.absolute(2);//points to 2nd row
rs.updateString("username","gita");
rs.updateString("country","nepal");
rs.updateRow();
            System.out.println("row updated");
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
  
}
