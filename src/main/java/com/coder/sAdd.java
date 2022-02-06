package com.coder;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sAdd
 */
@WebServlet("/sAdd")
public class sAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public sAdd() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		int n1 = Integer.parseInt(request.getParameter("num1"));
		
		int n2 = Integer.parseInt(request.getParameter("num2"));
		
		int s = n1+n2;
		
		request.setAttribute("sum", s);
		
		RequestDispatcher rd = request.getRequestDispatcher("sMulti");
		
		rd.forward(request, response);
		

	}
	



}
