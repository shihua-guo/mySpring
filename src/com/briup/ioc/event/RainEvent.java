package com.briup.ioc.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义的事件类
 * @author alan
 * @date Oct 19, 2016 2:51:23 PM
 */
public class RainEvent extends ApplicationEvent{

	public RainEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	} 

}
