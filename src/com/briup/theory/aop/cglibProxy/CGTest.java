package com.briup.theory.aop.cglibProxy;

public class CGTest {
	public static void main(String[] args) {
		CgLibProxy cglib = new CgLibProxy();
		Student proxy = (Student) cglib.getProxy(Student.class);
		proxy.say();
	}
}
