package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Context2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the ServletContext
        ServletContext context = getServletContext();

        // Retrieve the shared attribute set in Context1
        String institute = (String) context.getAttribute("company");

        // Display the value
        out.println("<h2>ServletContext Demo from Context2</h2>");
        if (institute != null) {
            out.println("Shared Institute Name (from Context1): " + institute);
        } else {
            out.println("Institute attribute not found. Visit /context1 first to set it.");
        }
    }
}
