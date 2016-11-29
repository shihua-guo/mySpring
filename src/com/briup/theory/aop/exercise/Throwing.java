package com.briup.theory.aop.exercise;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

import com.briup.bean.Logger;

/**
 * 异常通知，异常拦截器
 * @author alan
 * @date Oct 29, 2016 8:13:50 PM
 */
public class Throwing implements ThrowsAdvice {
	private Logger logger;
	public void afterThrowing(Method method, Object[] args, Object target,Exception e){
		logger.log(e.getMessage());
	}
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
}
