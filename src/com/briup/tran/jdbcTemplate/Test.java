package com.briup.tran.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Account;
import com.briup.tran.dao.AccountDao;

public class Test {
	private String path = "com/briup/tran/jdbcTemplate/jdbc_template.xml";

	ApplicationContext container = new ClassPathXmlApplicationContext(path);

	@org.junit.Test
	public void test1() {
		AccountDao dao = (AccountDao) container.getBean("dao");
		System.out.println(dao);
		dao.save(null);
	}
}
