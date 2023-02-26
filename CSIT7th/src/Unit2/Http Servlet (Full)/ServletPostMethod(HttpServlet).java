import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the username and password from the request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set the response content type
        response.setContentType("text/html");

        // Write the HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Welcome " + username + "!</h2>");
        out.println("<p>Your password is: " + password + "</p>");
        out.println("</body></html>");
    }
}


//HTML FORM IN ANOTHER FILE

<form action="LoginServlet" method="post">
    <label>Username:</label>
    <input type="text" name="username"><br>
    <label>Password:</label>
    <input type="password" name="password"><br>
    <input type="submit" value="Submit">
</form>