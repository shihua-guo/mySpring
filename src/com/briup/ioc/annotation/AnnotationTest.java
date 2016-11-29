package com.briup.ioc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationTest {
/*	// xml路径
	private String[] path = { "com/briup/ioc/annotation/annotation.xml" };
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);
*/
	/**
	 * @date 2016-10-19 16:41:01 测试注解
	 */
	@Test
	public void test1() {
		// xml路径
		String[] path = { "com/briup/ioc/annotation/annotation.xml" };
		// 容器
		ApplicationContext container = new ClassPathXmlApplicationContext(path);
		try {
			Boss bo = new Boss();
			bo = (Boss) container.getBean("boss");
			System.out.println(bo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*@Test
	public void test2() {
		try {
			Boss boss = (Boss) container.getBean("boss");
			System.out.println(boss);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
}
