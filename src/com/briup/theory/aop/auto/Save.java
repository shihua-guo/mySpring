package com.briup.theory.aop.auto;

import org.springframework.cache.annotation.CacheEvict;

public class Save implements ISave{
	private int userId = 123;
	@CacheEvict(key="#save.userId + 'save'", value ="myCache")
	public void save(){
		System.out.println("我再存钱");
	}
	
	public void drow(){
		System.out.println("我再取钱");
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
