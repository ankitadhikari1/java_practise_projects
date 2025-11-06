

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control in second servlet");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response from second servlet</h2>");
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		String city = (String) session.getAttribute("city");
		writer.println("hello "+name+"you are from "+city);
		
		writer.close();
	}

}
