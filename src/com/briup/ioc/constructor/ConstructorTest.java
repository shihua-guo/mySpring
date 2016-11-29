package com.briup.ioc.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Student;

public class ConstructorTest {
	// xml路径
	private String path = "com/briup/ioc/constructor/constructor.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-18 11:42:23 使用构造器注入
	 */
	@Test
	public void test1() {
		try {
			Student s = (Student) container.getBean("student");
			System.out.println(s.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
