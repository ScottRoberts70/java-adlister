import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute( "user" ) == null) {
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/profile");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        session.setAttribute("user", user);
        boolean validAttempt = user.equals("admin") && password.equals("password");

        if (validAttempt) {
            resp.sendRedirect("/profile");
        } else {
            resp.sendRedirect("/login");
        }
    }
}