import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCaculatorServlet", urlPatterns = "/display-discount")
public class ProductDiscountCaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent")) / 100;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        float discoutnAmount = price * discountPercent;
        float discountPrice = price - discoutnAmount;

        writer.println("<h2>");
        writer.println("</br> Product Description: " + productDescription);
        writer.println("</br> List price: " + price);
        writer.println("</br> Discount Percent: " + (discountPercent * 100) + "%");
        writer.println("</br> Discount Amount: "+discoutnAmount);
        writer.println("</br> Discount Price: " + discountPrice);
        writer.println("</h2>");

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
