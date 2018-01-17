package arch.springmvcmongo.service;

import java.util.List;

import arch.springmvcmongo.model.Customer;

public interface CustomerService {
	
	public void addCustomer(Customer customer);

	public List<Customer> listCustomer();

	public void deleteCustomer(Customer customer);

	public void updateCustomer(Customer customer);

}
