package com.lzy.ssh.web.action;

import com.lzy.ssh.domain.Customer;
import com.lzy.ssh.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Customer的action
 * 
 * @author Administrator
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer = new Customer();

	// 注入service的的customer
	private CustomerService customerService;
	// pring的set注入
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String save() {

		System.out.println(customer.toString());
		customerService.save(customer);
		return NONE;
	}

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
}
