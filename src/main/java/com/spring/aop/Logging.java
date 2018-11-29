package com.spring.aop;

public class Logging {

	public void beforeAdvice(){
		System.out.println("before");
	}
	
	public void afterAdvice(){
		System.out.println("after");
	}
	
	public void afterReturningAdvice(Object retVal){
		System.out.println("Returning:" + retVal.toString() );
	}
  
	public void AfterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("There has been an exception: " + ex.toString());   
	}  
	
	
}
