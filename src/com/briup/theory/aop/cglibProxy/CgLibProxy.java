package com.briup.theory.aop.cglibProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CgLibProxy implements MethodInterceptor{
	public Object getProxy(Class cls){
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(Student.class);
		enhancer.setCallback(this);//什么作用？？？
		//通过字节码技术创建子类实例
		return enhancer.create();
	}

	/**
	 * 实现MethodInterceptor
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("方法执行前：前置cglib代理");
		//调用父类的方法，并返回结果
		Object result = arg3.invokeSuper(arg0, arg2);
		System.out.println("方法执行后：后置cglib代理");
		return result;
	}

}
