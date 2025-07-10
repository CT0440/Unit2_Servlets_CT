package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/config",
    initParams = @WebInitParam(name = "trainer", value = "Susruthi")
)
public class Config_init_anno extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Getting init parameter
        String trainerName = getServletConfig().getInitParameter("trainer");

        out.println("<h2>Trainer Name: " + trainerName + "</h2>");
    }
}
