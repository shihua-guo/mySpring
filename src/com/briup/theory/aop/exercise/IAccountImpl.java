package com.briup.theory.aop.exercise;

public class IAccountImpl implements IAccountService{

	@Override
	public void deposit() {
		System.out.println("取钱============");
	}

	@Override
	public void withdraw() {
		System.out.println("存钱============");
		throw new RuntimeException("被打劫啦！！！！");
	}

	@Override
	public void error() {
		// TODO Auto-generated method stub
		int i;
		i=0/1;
		
	}
}
