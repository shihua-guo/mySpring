package com.briup.tran2.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.dao.DataAccessException;

import com.briup.bean.Account;

public class AccountDaoImpl implements AccountDao{
	private SessionFactory sessionFactory;
	@Override
	public void save(Account acc) throws DataAccessException {
		System.out.println(sessionFactory);
		Session session = sessionFactory.getCurrentSession();
		session.save(acc);
	}

	@Override
	public boolean update(Account acc) throws DataAccessException {
		return false;
	}

	@Override
	public boolean delete(Account acc) throws DataAccessException {
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
