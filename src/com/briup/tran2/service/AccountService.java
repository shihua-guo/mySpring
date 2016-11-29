package com.briup.tran2.service;

import com.briup.bean.Account;

public interface AccountService {
	void saveOrUpdate(Account account);
	void update(Account account);
	void delete(Account account);
}
