package com.briup.theory.aop.after;

public class Save implements ISave{
	public void save(){
		System.out.println("我再存钱");
	}
	public void drow(){
		System.out.println("我再取钱");
	}
}
