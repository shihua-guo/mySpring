package com.briup.theory.aop.aopconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
	// xml路径
	private String path = "com/briup/theory/aop/aopconfig/aopconfig2.xml";
	// 容器
	private ApplicationContext container = new ClassPathXmlApplicationContext(path);
	
	/**
	 * @date 2016-11-11 15:29:28 测试使用aop标签来获取advice
	 * 在handler中配置了所有的advice，
	 */
	@org.junit.Test
	public void test1(){
		try {
			Action act = (Action) container.getBean("act");
			System.out.println(act);
			act.act1();
			act.throwing();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
