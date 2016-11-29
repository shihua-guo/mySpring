package com.briup.theory.aop.dynamicProxy;

public class StudentImpl implements IStudentService{

	@Override
	public void newStu() {
		System.out.println("new Student=======");
	}

	@Override
	public void say() {
		System.out.println("say hello!!");
	}

	@Override
	public void eat() {
		System.out.println("eat somthing!!!!");
	}

}
