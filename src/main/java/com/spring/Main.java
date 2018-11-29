package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.aop.Student;
import com.spring.myEvent.MyEventsPublisher;

public class Main {
	
	public static void main(String[] args){
		/*
		 * spring提供了两种容器 1.ApplicationContext 2.BeanFactory
		 * BeanFactory 是最简单容器，主要为依赖注入(DI)提供支持
		 */
//		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//		Hello hello = (Hello) context.getBean("hello");
//		hello.getMessage();
		
//		BeanFactory factory = new ClassPathXmlApplicationContext(("application.xml"));
//		Hello hello = (Hello) factory.getBean("hello");
//		hello.getMessage();
		
		//事件
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//		context.start();
//		Hello hello = (Hello) context.getBean("hello");
//		hello.getMessage();
//		context.stop();
		
		//自定义事件
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//		
//		MyEventsPublisher cvp = (MyEventsPublisher) context.getBean("MyEventsPublisher"); 
//		cvp.publish("北京");
		
		
		//AOP
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Student student = (Student) context.getBean("Student");
		student.getName();
		student.getAge();
//		student.printThrowException();
	}	
}
