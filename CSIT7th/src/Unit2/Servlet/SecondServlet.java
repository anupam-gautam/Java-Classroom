/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serve;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.write("<h3>this is seconf servlet</h3>");
        
        
        //extracting form value
        
        String uname = req.getParameter("uname");
        String password = req.getParameter("upass");
        String repassword = req.getParameter("repass");
        String gender = req.getParameter("gender");
        if(uname == "" || password == "" || repassword == "" || gender == ""){
            pw.write("<h3>Please provide values</h3>");
        }
        else{
            pw.write("Usernmae is " + uname + "Password is" + password + "repass is " + repassword );
        }
         
        
    }
}
