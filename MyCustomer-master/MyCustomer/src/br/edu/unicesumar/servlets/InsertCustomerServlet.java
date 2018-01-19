package br.edu.unicesumar.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unicesumar.service.CustomerService;

/**
 * Servlet implementation class InsertCustomerServlet
 */
@WebServlet("/InsertCustomerServlet")
public class InsertCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		System.out.println("Hello " + name 
				+ " Email = " + email
				+ " Phone = " + phone);
		
		//Inserir Customer
		CustomerService service = new CustomerService();
		service.insertCustomer(0, name, email, phone);
		
		//Listar Todos
		

		//Redirecionar para a tela de listagem
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listCustomer.jsp");
		rd.forward(request, response);
	}

}
