package com.briup.tran.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Account;
import com.briup.tran.dao.AccountDao;

public class Test {
	private String path = "com/briup/tran/jdbc/spring_jdbc.xml";

	ApplicationContext container = new ClassPathXmlApplicationContext(path);

	@org.junit.Test
	public void test1() {
		AccountDao dao = (AccountDao) container.getBean("dao");
		Account acc = (Account) container.getBean("acc");
//		dao.save(acc);
		dao.update(acc);
	}
}
