package com.briup.tran2.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Account;

public class Test {
	private String path = "com/briup/tran2/jdbc/spring_jdbc.xml";
	ApplicationContext container = null;

	/**
	 * 测试第一种配置Hibernate事务：最普通的，每个步骤都需要。
	 */
	@org.junit.Test
	public void test1() {
		String path2 = "com/briup/tran2/jdbc/jdbcService.xml";
		container = new ClassPathXmlApplicationContext(path,path2);
		AccountService service = (AccountService) container.getBean("service");
		
		Account account = new Account(11,"alan",30000);
		service.saveOrUpdate(account);
		System.out.println();
	}
}
