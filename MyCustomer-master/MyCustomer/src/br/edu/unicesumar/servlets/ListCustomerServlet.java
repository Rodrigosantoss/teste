package br.edu.unicesumar.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.unicesumar.model.Customer;
import br.edu.unicesumar.service.CustomerService;

/**
 * Servlet implementation class ListCustomerServlet
 */
@WebServlet("/ListCustomerServlet")
public class ListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService service = new CustomerService();
		ArrayList<Customer> lista = new ArrayList<Customer>();
		
		//Obter do serviço a lista
		lista = (ArrayList<Customer>) service.listAll();
		
		//Atenção ao nome em aspas que vai ser usado na página
		request.setAttribute("listCustomer", lista);
		
		//Redirecionar
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listCustomer.jsp");
		rd.forward(request, response);
	}

}
