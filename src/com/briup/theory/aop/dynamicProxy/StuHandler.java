package com.briup.theory.aop.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuHandler implements InvocationHandler{
	private Object target;
	private StudentLogger stuLogger = new StudentLogger();
	
	public StuHandler(Object target, StudentLogger stuLogger) {
		this.target = target;
		this.stuLogger = stuLogger;
	}
	public StuHandler(Object target){
		this.target = target;
	}

	/**
	 * @param proxy 代理的目标对象镜像
	 * @param method 代理目标对象的方法镜像
	 * @param args 执行方法需要的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String msg = method.getName()+"方法被调用拉！！！";
		System.out.println(msg);
		Object object = method.invoke(target, args);
		return object;
	}

}
