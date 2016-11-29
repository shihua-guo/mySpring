package com.briup.theory.aop.staticProxy;

/**
 * 测试静态代理
 * @author alan
 * @date Oct 23, 2016 2:15:13 PM
 */
public class Test {
	public static void main(String[] args) {
		HelloService h1 =new HelloServiceImpl();
		HelloService proxy = new HelloServiceProxy(h1);
		proxy.say();
		
	}
}
