package com.briup.ioc.autoWired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Person;

public class AutoWiredTest {
	// xml路径
	private String path = "com/briup/ioc/autoWired/autowired.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-17 22:15:00 测试自动注入：再Person中注入Address
	 * byType,byName
	 */
	@Test
	public void test1() {
		try {
			Person p = (Person) container.getBean("person");
			System.out.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
