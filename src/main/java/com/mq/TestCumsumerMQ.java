package com.mq;

public class TestCumsumerMQ {
	
	public static void main(String[] args){
		Customer customer = new Customer();
		customer.init();
		TestCumsumerMQ testCumsumerMQ = new TestCumsumerMQ();
		
		new Thread(testCumsumerMQ.new CustomerMq(customer), "customer_1").start();
	}
	
	 private class CustomerMq implements Runnable{
		 Customer customer;
	        public CustomerMq(Customer customer){
	            this.customer = customer;
	        }

	        @Override
	        public void run() {
//	            while(true){
	                try {
	                	customer.getMessage("Jaycekon-MQ");
	                    Thread.sleep(10000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
//	            }
	        }
	    }
}
