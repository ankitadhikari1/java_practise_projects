

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {
	
	
	static {
		System.out.println("servlet is loaded");
	}
	
	public ServletLife() {
		System.out.println("servlet object is created");
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("servlet initialized");
	}

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servlet method to handle http request and to response back");
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
	}


}
