package br.edu.unicesumar.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.unicesumar.model.Customer;

public class CustomerDAO {
	public void insert(Customer c){
		
	}
	
	public List<Customer> listAll(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(1, "Alex", "alex@gmail.com", "41 3322-1212"));
		list.add(new Customer(2, "João", "joao@gmail.com", "41 3322-3214"));
		list.add(new Customer(3, "Maria", "maria@gmail.com", "41 3322-1515"));
		
		return list;
	}
}
