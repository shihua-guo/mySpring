package com.briup.theory.aop.exercise;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 {
	// xml路径
	private String path = "com/briup/theory/aop/exercise/advice.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);
 
	/**
	 * @date 2016-10-29 15:49:31 练习
	 */
	@Test
	public void test1() {
		try {
			IAccountService account= (IAccountService)container.getBean("proxy");
			account.deposit();
			account.withdraw();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
