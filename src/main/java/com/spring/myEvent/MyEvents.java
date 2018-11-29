package com.spring.myEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MyEvents extends ApplicationContextEvent{
	/*
	 * 自定义事件-事件
	 */
	
	public String to;
	
	public MyEvents(ApplicationContext source,String to) {
		super(source);
		this.to = to;
	}
	
	public String toString(){
		return "123 myevents";
	}
	
	public String getTo(){
		return to;
	}
}
