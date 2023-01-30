package iit.oop.sao;

import java.io.IOException;
import java.util.List;

import iit.oop.dao.Customer;

public interface CustomerService {
	
	public void writeData(Customer customer) throws IOException;
	
	public void viewData(Customer customer);
	
	public List<Customer> getAllCustomers(Customer customers);
	
	public List<Customer> getAllCustomers(Customer firstCustomer, 
			Customer secondCustomer);
	
}
