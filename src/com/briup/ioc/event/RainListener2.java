package com.briup.ioc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class RainListener2 implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		if(arg0 instanceof RainEvent){
			System.out.println("老蒋大喊："+arg0.getSource()+"不用上课啦！");
		}
	}

}
