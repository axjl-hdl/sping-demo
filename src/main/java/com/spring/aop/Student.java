package com.spring.aop;

public class Student {
	
	private String name;
	private String age;
	
	public Student(){
		
	}
	
	public Student(String name, String age){
		this.name = name;
		this.age = age;
	}
		
	public String getName() {
		System.out.println(""+ name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		System.out.println(""+ age);
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public void printThrowException(){
       System.out.println("Exception raised");
       throw new IllegalArgumentException();
   }

}
