package com.briup.ioc.factory;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Student;
import com.briup.bean.Teacher;

public class FactoryTest {
	// xml路径
	private String path = "com/briup/ioc/factory/factory.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-18 19:43:52 测试使用工厂获取链接
	 */
	@Test
	public void test1() {
		try {
			Connection conn = (Connection) container.getBean("dataSource");
			System.out.println(conn);
			Connection conn1 = (Connection) container.getBean("dataSource");
			System.out.println(conn1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
