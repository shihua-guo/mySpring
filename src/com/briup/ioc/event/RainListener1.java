package com.briup.ioc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class RainListener1 implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		if(arg0 instanceof RainEvent){
			System.out.println("小顺大喊："+arg0.getSource()+"回家收衣服啦！");
		}
	}

}
