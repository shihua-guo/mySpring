package com.briup.theory.aop.aopconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	// xml路径
	private String path = "com/briup/theory/aop/aopconfig/aopconfig.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);
	
	/**
	 * @date 2016-11-11 15:07:43 测试使用aop-config来织入代理
	 */
	@org.junit.Test
	public void test1(){
		try {
			Action act = (Action) container.getBean("act");
			System.out.println(act);
			act.act1();
			act.act2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
