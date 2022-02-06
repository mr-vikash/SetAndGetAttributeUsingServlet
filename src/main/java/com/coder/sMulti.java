package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sMulti
 */
@WebServlet("/sMulti")
public class sMulti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sMulti() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
		
		int n1 = Integer.parseInt(request.getParameter("num1"));
		
		int n2 = Integer.parseInt(request.getParameter("num2"));
		
		int m = n1*n2;
		
		int s= (int)request.getAttribute("sum");
		
		out.println("<h2>");
		out.println("Sum of the given number = "+s);
		out.println("</h2>");
		out.println("<br>");
		
		out.println("<h2>");
		out.println("Multiplication  of the given number = "+m);
		out.println("</h2>");
	}

}
