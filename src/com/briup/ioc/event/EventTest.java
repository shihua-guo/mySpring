package com.briup.ioc.event;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Student;

public class EventTest {
	// xml路径
	private String[] path = { "com/briup/ioc/event/event.xml" };
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);

	/**
	 * @date 2016-10-19 14:55:51 测试自定义事件
	 */
	@Test
	public void test1() {
		try {
			container.publishEvent(new RainEvent("下雨了！"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
