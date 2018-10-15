package com.lzy.ssh.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lzy.ssh.dao.CustomerDao;
import com.lzy.ssh.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		System.out.println("DaoSave-----------------");
		this.getHibernateTemplate().save(customer);
	}

}
