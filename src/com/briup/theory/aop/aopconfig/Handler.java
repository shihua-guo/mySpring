package com.briup.theory.aop.aopconfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 所以切面类都放在这里，可以直接在aop-config中
 * 配置对应的advice方法
 * @author alan
 * @date Nov 11, 2016 3:11:52 PM
 */
public class Handler {
	/**
	 * before
	 * @param jp
	 */
	public void before(JoinPoint jp){
		System.out.println(jp.getSignature().getName()+"执行前......");
	}
	/**
	 * after
	 * @param jp
	 */
	public void after(JoinPoint jp){
		System.out.println(jp.getSignature().getName()+"执行后......");
	}
	/**
	 * after return
	 * @param jp
	 */
	public void afterReturning(JoinPoint jp){
		System.out.println(jp.getSignature().getName()+"执行并且返回后....");
	}
	
	/**
	 * around:使用aroud的时候要加上：ProceedingJoinPoint参数
	 * 因为JoinPoint不能调用连接点所表示的方法
	 * ProceedingJoinPoint调用连接点表示的方法：.proceed()
	 * @param jp
	 */
	public Object around(ProceedingJoinPoint pjp){
		try {
			System.out.println(pjp.getSignature().getName()+"准备执行啦！！！");
			Object res = pjp.proceed();
			System.out.println(pjp.getSignature().getName()+"执行完毕啦！！！");
			return res;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
		
	}
	
	/**
	 * throw
	 * @param jp
	 */
	public void throwing(JoinPoint jp,Exception ex){
		System.out.println(jp.getSignature().getName()+"正在抛出异常："+ex);
	}
}
