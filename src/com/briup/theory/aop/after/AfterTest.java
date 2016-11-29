package com.briup.theory.aop.after;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.theory.aop.after.ISave;

public class AfterTest {
	// xml路径
	private String path = "com/briup/theory/aop/after/after.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-26 18:15:41 测试After通知器
	 */
	@Test
	public void test1() {
		try {
			ISave bean = (ISave) container.getBean("proxy");
			bean.drow();
			bean.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
