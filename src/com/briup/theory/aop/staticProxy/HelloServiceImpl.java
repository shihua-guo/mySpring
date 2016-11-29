package com.briup.theory.aop.staticProxy;

public class HelloServiceImpl implements HelloService{

	@Override
	public void say() {
		System.out.println("hello world!");
	}

}
