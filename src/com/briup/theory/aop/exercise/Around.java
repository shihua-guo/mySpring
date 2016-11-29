package com.briup.theory.aop.exercise;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class Around implements MethodInterceptor{
	private Bank bank;
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object result=null;
		//mi就是要调用方法的镜像
		if(mi.getMethod().getName().equals("withdraw")){
			//调用方法前执行的
			bank.takeCard();
			//方法执行
			result = mi.proceed();
			//方法执行后执行的
			bank.putCard();
		}
		else{
			result = mi.proceed();
		}
		return result;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}


}
