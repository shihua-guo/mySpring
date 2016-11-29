package com.briup.ioc.set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Person;
import com.briup.bean.Student;

public class SetTest {
	//xml路径
	private String path = "com/briup/ioc/set/set.xml";
	//容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);
	
	/**
	 * @date 2016-10-17 21:39:10 测试用set方法获取对象
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
	
	/**
	 * @date 2016-10-17 21:42:49 测试别名
	 */
	@Test
	public void test2() {
		try {
			Student s = (Student) container.getBean("s1");
			System.out.println(s.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
