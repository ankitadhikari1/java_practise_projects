

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("control in first servlet");
		
		String name = request.getParameter("username");
		String city = request.getParameter("city");
		
		
		
		
		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("secondServlet");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("city", city);
		
		reqDispatch.forward(request, response);
//		reqDispatch.include(request, response);
		PrintWriter writer = response.getWriter();
		writer.println("<h1> Response from servlet 1 </h1>");
		writer.close();
		System.out.println("control again in first servlet");
	}

}
