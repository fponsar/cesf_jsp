package com.calculadora2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputEnters
 */
@WebServlet("/InputEnters")
public class InputEnters extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputEnters() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int n1 = Integer.parseInt(request.getParameter("p1")) ;
		int n2 = Integer.parseInt(request.getParameter("p2")) ;
		String oper = request.getParameter("oper") ;
		String res ="" ;
		
		if (oper.equals("suma")) { res = Calculadora.suma(n1,n2); }
		else if (oper.equals("resta")) { res = Calculadora.resta(n1,n2); }
		else if (oper.equals("multiplica")) { res = Calculadora.multiplica(n1,n2); }
		else if (oper.equals("divide")) { res = Calculadora.divide(n1,n2); }
		
		response.getWriter().append(res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
