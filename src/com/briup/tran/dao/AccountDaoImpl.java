package com.briup.tran.dao;

import org.springframework.dao.DataAccessException;

import com.briup.bean.Account;

public class AccountDaoImpl implements AccountDao{

	@Override
	public void save(Account acc) throws DataAccessException {
		
	}

	@Override
	public boolean update(Account acc) throws DataAccessException {
		return false;
	}

	@Override
	public boolean delete(Account acc) throws DataAccessException {
		return false;
	}

}
