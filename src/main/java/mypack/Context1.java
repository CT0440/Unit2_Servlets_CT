package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Context1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Step 1: Get the ServletContext object
        ServletContext context = getServletContext();

        // Step 2: Get context parameter from web.xml
        String developer = context.getInitParameter("Trainer");

        // Step 3: Set a shared attribute
        context.setAttribute("company", "CodeTantra Tech Solutions");

        // Step 4: Retrieve shared attribute
        String institute = (String) context.getAttribute("company");

        // Step 5: Display everything
        out.println("<h2>ServletContext Demo from Context1</h2>");
        out.println("Developer (from web.xml): " + developer + "<br>");
        out.println("Shared Institute Name: " + institute);
    }
}
