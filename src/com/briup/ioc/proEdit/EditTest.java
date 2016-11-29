package com.briup.ioc.proEdit;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Student;

public class EditTest {
	// xml路径
	private String[] path = {"com/briup/ioc/proEdit/proEdit.xml","com/briup/ioc/proEdit/plugin.xml"};
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-18 21:00:25 测试使用对象转换器，把String的转换为Address
	 */
	@Test
	public void test1() {
		try {
			Student conn = (Student) container.getBean("student");
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
