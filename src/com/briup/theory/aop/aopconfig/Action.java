package com.briup.theory.aop.aopconfig;

public class Action {
	public void act1(){
		System.out.println("我是action1！");
	}
	public void act2(){
		System.out.println("我是action2！");
	}
	public void act3(){
		System.out.println("我是action3！");
	}
	public void throwing() throws Exception{
		throw new Exception("我是异常！！！");
	}
}
