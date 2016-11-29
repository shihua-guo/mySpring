package com.briup.theory.aop.exercise;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class After implements AfterReturningAdvice{
	private Bank bank;
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		bank.outBank();
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
