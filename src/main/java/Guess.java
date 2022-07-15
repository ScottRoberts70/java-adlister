import javax.servlet.RequestDispatcher;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

@WebServlet(name = "Guess", urlPatterns = "/guess")
public class Guess extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String guess = req.getParameter("guess");
        req.setAttribute("guess", guess);
        String randNum = String.valueOf((int) Math.floor((Math.random() * 3)) + 1);
        if (guess != null && guess.equalsIgnoreCase(randNum)){
            resp.sendRedirect("/correct");
            System.out.println(randNum);
        }else if (guess != null && parseInt(guess) > 3 || parseInt(guess) < 1) {
            resp.sendRedirect("/guess");
        }else {
        resp.sendRedirect("/incorrect");
    }
}}