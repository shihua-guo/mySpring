package com.briup.tran2.jdbc;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.briup.bean.Account;
import com.briup.tran2.dao.AccountDao;

@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
public class AccountServiceImpl implements AccountService {
	private AccountDao dao;
	
	@Override
	public void saveOrUpdate(Account account) {
		dao.save(account);
		//throw new RuntimeException("测试事务！");
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub

	}

	public AccountDao getDao() {
		return dao;
	}

	public void setDao(AccountDao dao) {
		this.dao = dao;
	}


}
