package arch.springmvcmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import arch.springmvcmongo.dao.CustomerDAO;
import arch.springmvcmongo.model.Customer;
import arch.springmvcmongo.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomerList(ModelMap model) {
		model.addAttribute("customerList", customerService.listCustomer());
		return "output";
	}

	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public View createCustomer(@ModelAttribute Customer customer, ModelMap model) {
		if (StringUtils.hasText(customer.getId())) {
			customerService.updateCustomer(customer);
		} else {
			customerService.addCustomer(customer);
		}
		return new RedirectView("/SpringMVCMongoDB/customer");
	}

	@RequestMapping(value = "/customer/delete", method = RequestMethod.GET)
	public View deleteCustomer(@ModelAttribute Customer customer, ModelMap model) {
		customerService.deleteCustomer(customer);
		return new RedirectView("/SpringMVCMongoDB/customer");
	}

}
