package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Write a Servlet program to send username and password using HTML forms and 
//authenticate the user. details A servlet program to handle user form A servlet program to create a cookie A servlet program to display
//cookie
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "ct123".equals(password)) {
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60 * 60); // 1 hour
            res.addCookie(userCookie);

            out.println("<h2>Welcome to Homepage, " + username + "!</h2>");
        } else {
            out.println("<h2>Invalid username or password</h2>");
            out.println("<a href='login.html'>Try again</a>");
        }
    }
}
