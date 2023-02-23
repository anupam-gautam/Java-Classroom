
package serve;

//(write this line instead of jakarta
//import javax.servlet.Servlet
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServelet implements Servlet{

    ServletConfig conn;
    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.conn = sc;
        System.out.println("ServLet Start");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServletConfig getServletConfig() {
        return conn;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Servlet Running");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.write("<h3> This is first Servlet Example </h3>");
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        System.out.println("Servlet End");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
