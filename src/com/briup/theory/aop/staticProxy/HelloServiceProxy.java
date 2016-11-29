package com.briup.theory.aop.staticProxy;

public class HelloServiceProxy implements HelloService{
	private HelloService h;
	public HelloServiceProxy(HelloService h) {
		this.h = h;
	}
	@Override
	public void say() {
		//代理输出，并产生日志
		System.out.println("log:hello........");
		h.say();
	}

}
