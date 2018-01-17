package arch.springmvcmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arch.springmvcmongo.dao.CustomerDAO;
import arch.springmvcmongo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDAO customerDao;

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		
	}

	public List<Customer> listCustomer() {
		return customerDao.listCustomer();
	}

	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);
		
	}

	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
		
	}

}
