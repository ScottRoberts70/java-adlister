import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;


@WebServlet(name = "PageCounter", urlPatterns = "/count")
public class PageCounter extends HttpServlet {
    private int viewCount;
    public void init() {
        viewCount = 0;
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean pageCount = request.getParameter("reset") != null;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (pageCount) viewCount = 0;
        viewCount++;
        out.println("<h1>" + viewCount + "</h1>");
    }
}
