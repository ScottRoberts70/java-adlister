import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> ads = adsDao.all();
        String username;
        if (session.getAttribute("username") == null){
            username = "there";
        } else {
            username = ",  "  + session.getAttribute("username");
        }
        req.setAttribute("username", username);
        req.setAttribute("ads", DaoFactory.getAdsDao().all());
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}
