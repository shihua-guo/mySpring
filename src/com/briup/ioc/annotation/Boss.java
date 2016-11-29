package com.briup.ioc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("boss")
public class Boss {
	private String name;
	// @Autowired
	@Resource
	private Car car;
	// @Autowired
	@Resource
	private Office office;

	public Boss() {
		// TODO Auto-generated constructor stub
	}

	public Boss(String name, Car car, Office office) {
		this.name = name;
		this.car = car;
		this.office = office;
	}

	public Boss(Car car, Office office) {
		this.car = car;
		this.office = office;
	}

	// @Autowired
	public Boss(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	// @Autowired
	public void setCar(Car car) {
		this.car = car;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	@PostConstruct
	public void init() {
		System.out.println("初始化..");
	}

	@PreDestroy
	public void destory() {
		System.out.println("销毁...");
	}

	@Override
	public String toString() {
		return "Boss [name=" + name + ", car=" + car + ", office=" + office + "]";
	}

}
