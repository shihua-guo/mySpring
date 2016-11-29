package com.briup.theory.aop.before;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.briup.bean.Logger;

public class Before implements MethodBeforeAdvice{
	//切面类
	private Logger logger;
	@Override
	public void before(Method m,Object[] args,Object target) throws Throwable{
		logger.log(m.getName()+"被调用拉！！！！！");
		//这里，不需要手动调用，spring会自动执行invoke，如果再手动执行就会调用2次
		
	}
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
