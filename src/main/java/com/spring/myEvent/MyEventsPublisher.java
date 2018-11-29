package com.spring.myEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class MyEventsPublisher {
	/*
	 * 自定义事件-事件源，传播事件
	 * 
	 */
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public void publish(String to){
//		MyEvents events = new MyEvents(source);
//		publisher.publishEvent(events);//
		System.out.println("开始发送");
		MyEvents events = new MyEvents(applicationContext,to);
		applicationContext.publishEvent(events);//事件广播，通知给监听器
	}
}
