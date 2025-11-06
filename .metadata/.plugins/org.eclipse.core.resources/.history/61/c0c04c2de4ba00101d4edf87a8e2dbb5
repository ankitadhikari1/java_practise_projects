

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	
	public FirstServlet() {
		System.out.println("servlet object is created by ankit");
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String city = request.getParameter("city");
		
		PrintWriter writer = response.getWriter();
		writer.println("hello "+ name);
		writer.println("i know you are from "+city);
		writer.close();
		
	}

}
