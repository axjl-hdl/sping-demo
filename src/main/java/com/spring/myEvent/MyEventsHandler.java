package com.spring.myEvent;

import org.springframework.context.ApplicationListener;

public class MyEventsHandler implements ApplicationListener<MyEvents>{
	
	/*
	 * 自定义事件-事件监听注册
	 */
	
	public void onApplicationEvent(MyEvents event) {
		System.out.println("监听到向"+event.getTo()+"的发送请求");
	}
}
