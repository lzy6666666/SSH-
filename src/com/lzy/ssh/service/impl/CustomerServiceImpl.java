package com.lzy.ssh.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.lzy.ssh.dao.CustomerDao;
import com.lzy.ssh.domain.Customer;
import com.lzy.ssh.service.CustomerService;

@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	//Customer的dao注入
	private CustomerDao customerDao;
	//set注入
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void save(Customer customer) {
		
		System.out.println("serviceSave-----------------");
		customerDao.save(customer);
	}

}
