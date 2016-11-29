package com.briup.tran.dao;

import org.springframework.dao.DataAccessException;
import com.briup.bean.Account;

public interface AccountDao {
	void save(Account acc) throws DataAccessException;
	boolean update(Account acc) throws DataAccessException;
	boolean delete(Account acc) throws DataAccessException;
}
