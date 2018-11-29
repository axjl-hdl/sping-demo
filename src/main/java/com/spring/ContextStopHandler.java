package com.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopHandler implements ApplicationListener<ContextStoppedEvent>{
	/*
	 * ApplicationListener 
	 * 
	 * spring核心-ApplicationContext，负责管理bean的生命周期
	 * 当加载 beans 时，ApplicationContext 发布某些类型的事件
	 * 通过 ApplicationEvent 类和 ApplicationListener 接口来提供在 ApplicationContext 中处理事件
	*/
	
	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("ContextStoppedEvent Received");		
	}

}
