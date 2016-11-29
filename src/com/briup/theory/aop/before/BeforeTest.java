package com.briup.theory.aop.before;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Person;

public class BeforeTest {
	// xml路径
	private String path = "com/briup/theory/aop/before/before.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-26 16:57:45 测试spring的AOP：代理
	 */
	@Test
	public void test1() {
		try {
			ISave bean = (ISave) container.getBean("proxy");
			bean.save();
			bean.drow();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
