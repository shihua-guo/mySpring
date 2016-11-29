package com.briup.ioc.InstanceFactory;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Student;
import com.briup.bean.Teacher;

public class InsFactoryTest {
	// xml路径
	private String path = "com/briup/ioc/InstanceFactory/insFactory.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-18 20:04:44 测试使用工厂获取连接（非继承，非入侵的。Ins）
	 */
	@Test
	public void test1() {
		try {
			Connection conn = (Connection) container.getBean("conn");
			System.out.println(conn);
			Connection conn1 = (Connection) container.getBean("conn");
			System.out.println(conn1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
