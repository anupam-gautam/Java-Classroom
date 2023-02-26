import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the response content type
        response.setContentType("text/html");

        // Get the input values from the request parameters
        String id = request.getParameter("id");

        // Create the HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        // Access the database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "myusername", "mypassword");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable WHERE id=" + id);
            if (rs.next()) {
                out.println("<h1>Hello, " + rs.getString("name") + "!</h1>");
            } else {
                out.println("<h1>User not found</h1>");
            }
            conn.close();
        } catch (Exception e) {
            out.println("<h1>Database error: " + e.getMessage() + "</h1>");
        }

        out.println("</body></html>");
    }
}
