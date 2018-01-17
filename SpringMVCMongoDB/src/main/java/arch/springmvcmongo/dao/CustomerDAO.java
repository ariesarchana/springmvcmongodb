package arch.springmvcmongo.dao;

import java.util.List;

import arch.springmvcmongo.model.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer customer);

	public List<Customer> listCustomer();

	public void deleteCustomer(Customer customer);

	public void updateCustomer(Customer customer);
}