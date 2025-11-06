

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String city = request.getParameter("city");
		
		PrintWriter writer = response.getWriter();
		
		
		if(name.equals("Ankit") && city.equals("Haldwani")) {
			writer.println("hello "+ name+ "cutie");
			writer.println("i know you are from "+city);
		}
		else {
			writer.println("hello "+ "mother fucker");
			writer.println("i know you are from "+ " your mother" );
		}
		writer.close();
		
	}

}
