package com.briup.tran.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.dao.DataAccessException;

import com.briup.bean.Account;
import com.briup.tran.dao.AccountDao;

public class HibernateAccountDao implements AccountDao{
	private SessionFactory sessionFactory;

	@Override
	public void save(Account acc) throws DataAccessException {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Account account = (Account) session.get(Account.class,acc.getId());
		System.out.println(account);
		account.setBalance(account.getBalance()-100);
		session.update(account);
		session.getTransaction().commit();
	}

	@Override
	public boolean update(Account acc) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Account acc) throws DataAccessException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
