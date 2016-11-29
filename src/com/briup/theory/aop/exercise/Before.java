package com.briup.theory.aop.exercise;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Before implements MethodBeforeAdvice {
	private Bank bank;
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		bank.intoBank();
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
