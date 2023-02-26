import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFormServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the response content type
        response.setContentType("text/html");

        // Get the input values from the request parameters
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");

        // Create the HTML response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + firstName + " " + lastName + "!</h1>");
        out.println("</body></html>");
    }
}



//HTML FORM IN ANOTHER FILE

<form action="MyFormServlet" method="get">
    <label>First Name:</label>
    <input type="text" name="first_name"><br>
    <label>Last Name:</label>
    <input type="text" name="last_name"><br>
    <input type="submit" value="Submit">
</form>