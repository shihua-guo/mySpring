package com.briup.theory.aop.auto;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutoTest {
	// xml路径
	private String path = "com/briup/theory/aop/auto/auto.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-26 18:15:41 测试After通知器
	 */
	@Test
	public void test1() {
		try {
			ISave bean = (ISave) container.getBean("save1");
			Drop drop = (Drop) container.getBean("drop");
			System.out.println(bean.getClass());
			System.out.println("drop====="+drop.getClass());
			bean.drow();
			bean.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
