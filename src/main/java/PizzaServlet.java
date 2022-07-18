import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet{
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            request.getRequestDispatcher("/WEB-INF/pizza-order.jsp").forward(request, response);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String deliveryAdd = req.getParameter("deliveryAdd");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String toppings = Arrays.toString(req.getParameterValues("toppings"));
        boolean submitButtonPressed = req.getParameter("submit") != null;
        System.out.printf("fname: %s%n", fname);
        System.out.printf("lname: %s%n", lname);
        System.out.printf("delliveryAdd: %s%n", deliveryAdd);
        System.out.printf("crust: %s%n", crust);
        System.out.printf("sauce: %s%n", sauce);
        System.out.printf("size: %s%n", size);
        System.out.printf("toppings: %s%n", toppings);
    }
}


//String[] toppings = req.getParameterValues("toppings");
//
//PrintWriter out resp.getWriter();
//out.println(crust);
//if (toppings)

