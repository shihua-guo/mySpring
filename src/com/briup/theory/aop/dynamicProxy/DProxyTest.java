package com.briup.theory.aop.dynamicProxy;

import java.lang.reflect.Proxy;

public class DProxyTest {
	public static void Test(){
		IStudentService stu = new StudentImpl();
		ClassLoader loader = stu.getClass().getClassLoader();
		Class<?>[] interfaces = stu.getClass().getInterfaces();
		StuHandler h = new StuHandler(stu);
		IStudentService stuProxy = (IStudentService) Proxy.newProxyInstance(loader, interfaces, h);
		stuProxy.say();
		stuProxy.newStu();
		
	}
	public static void main(String[] args) {
		Test();
	}
}
