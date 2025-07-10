package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// A servlet to demonstrate Servlet Life Cycle
@WebServlet("/lifecycle")
public class LifeCycle extends HttpServlet {

    
    public void init() throws ServletException {
        System.out.println("Servlet is initialized — init() called");
    }

    
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Request is being serviced — service() called");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Inside service() method of LifeCycle Servlet</h2>");
    }

 
    public void destroy() {
        System.out.println("Servlet is destroyed — destroy() called");
    }
}
