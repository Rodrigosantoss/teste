package br.edu.unicesumar.service;

import java.util.List;

import br.edu.unicesumar.dao.CustomerDAO;
import br.edu.unicesumar.model.Customer;

public class CustomerService {
	private CustomerDAO dao;
	
	public CustomerService(){
		dao = new CustomerDAO();
	}
	
	public void insertCustomer(int id, String name, String email, String phone){
		//Chamar a DAO
	}
	
	public Customer findCustomer(int id){
		//Instanciar a DAO e obter uma lista
		CustomerDAO dao = new CustomerDAO();
		List<Customer> lista = dao.listAll();
		
		
		for(Customer c : lista){
			if(c.getId() == id)
				return c;//Encontrou um cliente
		}
		
		return null;
	}
	
	public List<Customer> listAll(){
		return dao.listAll();
	}
}
