package com.briup.ioc.coll;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.CollBean;
public class CollTest {
	//xml路径
		private String path = "com/briup/ioc/coll/coll.xml";
		//容器
		private ApplicationContext container = new ClassPathXmlApplicationContext(path);
		
	/**
	 * @date 2016-10-17 21:56:47 测试注入集合
	 */
	@Test
	public void test1(){
		try {
			CollBean coll = (CollBean) container.getBean("collBean");
			System.out.println(coll.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
