import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/counter")
public class Counter extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().println(
            "<h2>Simple Counter</h2>" +
            "<p>Current Count: " + count + "</p>" +
            "<form method='post'>" +
            "<button type='submit'>Increase Counter</button>" +
            "</form>"
        );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        count++; // increment

        doGet(request, response); // reload SAME PAGE with updated count
    }
}
