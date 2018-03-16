package com.calculadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DosMasDos
 */
@WebServlet("/DosMasDos")
public class DosMasDos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DosMasDos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// retorna la suma de dos enters que piquem com a p1 i p2 a barra
		// de navegació amb format .../DosMasDos?p1=num1&p2=num2
		
		String num1 = request.getParameter("p1") ;
		String num2 = request.getParameter("p2") ;
		
		int suma = Integer.parseInt(num1)+Integer.parseInt(num2) ;
		
		response.getWriter().append("Resultat: " + suma);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
