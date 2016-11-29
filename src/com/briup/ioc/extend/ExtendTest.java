package com.briup.ioc.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Student;
import com.briup.bean.Teacher;

public class ExtendTest {
	// xml路径
	private String path = "com/briup/ioc/extend/extends.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);
	/**
	 * @date 2016-10-18 18:35:18 使用继承以及测试单例
	 */
	@Test
	public void test1() {
		try {
			Student s = (Student) container.getBean("student");
			System.out.println(s.hashCode());
			Teacher t = (Teacher) container.getBean("t1");
			System.out.println(t.toString());
			
			//单例的
			Student s2 = (Student) container.getBean("student");
			System.out.println(s2.hashCode());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
