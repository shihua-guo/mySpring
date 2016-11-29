package com.briup.tran.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Account;
import com.briup.tran.dao.AccountDao;

public class Test {
	private String path = "com/briup/tran/hibernate/hibernate.xml";

	ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * 测试使用spring结合hibernate
	 */
	@org.junit.Test
	public void test1() {
		AccountDao dao = (AccountDao) container.getBean("dao");
		dao.save(new Account(0,"alan",99900));
		System.out.println(dao);
	}
	
	/**
	 * 测试使用hibernate_template
	 */
	@org.junit.Test
	public void test2() {
		path = "com/briup/tran/hibernate/hibernate_template.xml";
		container = new ClassPathXmlApplicationContext(path);
		AccountDao dao = (AccountDao) container.getBean("dao");
		Account acc = new Account(0,"alan",99900);
//		dao.save(acc);
		System.out.println(dao);
		
		dao.update(acc);
	}
	
}
