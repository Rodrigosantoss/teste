package br.edu.unicesumar.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unicesumar.model.Customer;
import br.edu.unicesumar.service.CustomerService;

/**
 * Servlet implementation class FindCustomerServlet
 */
@WebServlet("/FindCustomerServlet")
public class FindCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obter o parametro 'id' do formulário
		String id;
		
		//Converter id em um número inteiro
		int idConvertido = 0;
		
		CustomerService service = new CustomerService();
		Customer cliente = service.findCustomer(idConvertido);
		
		//Salvar na request o 'cliente' obtido
		//request.set
		
		String nextPage = "/listCustomer.jsp";
		
		if(idConvertido != 0)
			nextPage = "/viewCustomer.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
