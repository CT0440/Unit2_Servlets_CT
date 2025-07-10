package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Lab-3Q.1 - Servlet Programming Servlet Execution on Tomcat
// A servlet program to print Hello World

@WebServlet("/hello")
public class HelloServlet_Anno extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello World</h1>");
    }
}
