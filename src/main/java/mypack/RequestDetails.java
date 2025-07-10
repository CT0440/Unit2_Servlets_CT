package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

// Lab-3Q.2 - A servlet program to display request details

@WebServlet("/requestdetails")
public class RequestDetails extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h2>Request Details</h2>");
        out.println("<p><strong>Method:</strong> " + req.getMethod() + "</p>");
        out.println("<p><strong>Protocol:</strong> " + req.getProtocol() + "</p>");
        out.println("<p><strong>Request URI:</strong> " + req.getRequestURI() + "</p>");
        out.println("<p><strong>Context Path:</strong> " + req.getContextPath() + "</p>");
        out.println("<p><strong>Remote Address:</strong> " + req.getRemoteAddr() + "</p>");
        out.println("</body></html>");
    }
}
