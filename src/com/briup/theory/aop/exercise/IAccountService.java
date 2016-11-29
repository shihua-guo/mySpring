package com.briup.theory.aop.exercise;

/**
 * 修改IAccountService，在其中加入deposit和withdraw方法
 * @author alan
 * @date Oct 29, 2016 3:31:01 PM
 */
public interface IAccountService {
	void deposit();
	void withdraw();
	void error();
}
