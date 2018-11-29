package com.mq;

public class TestMQ {

	public static void main(String[] args) {
		Producter producter = new Producter();
		producter.init();
	     
		TestMQ testMq = new TestMQ();
	     
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Thread 1
		new Thread(testMq.new ProductorMq(producter), "thread_test_1").start();
		//Thread 2
		new Thread(testMq.new ProductorMq(producter), "thread_test_2").start();
//		//Thread 3
//		new Thread(testMq.new ProductorMq(producter)).start();
//		//Thread 4
//		new Thread(testMq.new ProductorMq(producter)).start();
//		//Thread 5
//		new Thread(testMq.new ProductorMq(producter)).start();

	}
	
	private class ProductorMq implements Runnable{
		
		Producter producter;
		
        public ProductorMq(Producter producter){
            this.producter = producter;
        }

        @Override
        public void run() {
//        	int count = 0;
//            while(count < 5){
//            	count++;
                try {
                    producter.sendMessage("HDL-MQ");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            }
        }
	}

}
