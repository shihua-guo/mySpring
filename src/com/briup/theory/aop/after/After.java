package com.briup.theory.aop.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.briup.bean.Logger;

public class After implements AfterReturningAdvice {
	private Logger logger ;
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		logger.log(method.getName()+":被调用啦！！！");
	}
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
