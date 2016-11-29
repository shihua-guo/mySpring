package com.briup.tran2.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Account;

public class Test {

	private String path = "com/briup/tran2/hibernate/hibernate.xml";
	ApplicationContext container = null;

	/**
	 * 测试第一种配置Hibernate事务：最普通的，每个步骤都需要。
	 */
	@org.junit.Test
	public void test1() {
		String path2 = "com/briup/tran2/service/hibernateService1.xml";
		container = new ClassPathXmlApplicationContext(path,path2);
		AccountService service = (AccountService) container.getBean("proxy");
		
		Account account = new Account(1,"alan",30000);
		service.saveOrUpdate(account);
		System.out.println();
	}
	
	
	/**
	 * 测试第2种配置Hibernate事务：无须配置拦截器，在代理对象中有。
	 */
	@org.junit.Test
	public void test2() {
		String path2 = "com/briup/tran2/service/hibernateService2.xml";
		container = new ClassPathXmlApplicationContext(path,path2);
		AccountService service = (AccountService) container.getBean("proxy");
		Account account = new Account(3,"alan",30000);
		service.saveOrUpdate(account);
		System.out.println();
	}
	
	
	/**
	 * 测试第3种配置Hibernate事务:通过bean的name，代理对象自动注入目标对象和拦截器。
	 */
	@org.junit.Test
	public void test3() {
		String path2 = "com/briup/tran2/service/hibernateService3.xml";
		container = new ClassPathXmlApplicationContext(path,path2);
		AccountService service = (AccountService) container.getBean("service");
		Account account = new Account(4,"alan",30000);
		service.saveOrUpdate(account);
		System.out.println();
	}
	
	
	
	/**
	 * 测试第4种配置Hibernate事务:
	 * 代理对象自动注入目标对象和拦截器还有增强器（已经注入拦截器还有需要织入的方法）。
	 */
	@org.junit.Test
	public void test4() {
		String path2 = "com/briup/tran2/service/hibernateService4.xml";
		container = new ClassPathXmlApplicationContext(path,path2);
		AccountService service = (AccountService) container.getBean("service");
		Account account = new Account(10,"alan",30000);
		service.saveOrUpdate(account);
		System.out.println();
	}
	
	
	
	/**
	 * 测试第5种配置Hibernate事务:
	 * 使用tx标签来配置事务拦截器：advice
	 * 使用aop-config标签配置代理对象。
	 */
	@org.junit.Test
	public void test5() {
		String path2 = "com/briup/tran2/service/hibernateService5.xml";
		container = new ClassPathXmlApplicationContext(path,path2);
		AccountService service = (AccountService) container.getBean("service");
		Account account = new Account(8,"alan",30000);
		service.saveOrUpdate(account);
	}
	
	
	/**
	 * 测试第6种配置Hibernate事务:
	 * 使用tx标签告诉spring已经在目标对象接入注解，并指明使用哪个事务管理器
	 * 在目标类中添加Transactional注解，并配置事务属性
	 */
	@org.junit.Test
	public void test6() {
		String path2 = "com/briup/tran2/service/hibernateService6.xml";
		container = new ClassPathXmlApplicationContext(path,path2);
		AccountService service = (AccountService) container.getBean("service");
		Account account = new Account(9,"alan",30000);
		service.saveOrUpdate(account);
	}
	
}
