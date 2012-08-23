package com.mercury.rb_multithread;

/**
 * @Title: TestThread.java
 * @Description: Class who extends Thread.
 * @author Robert Shi
 * @date Aug 23, 2012 4:11:01 PM
 * @version V1.0
 */
public class TestThread extends Thread {

	public TestThread(String name) {
		super(name);// an usage of super keyword to init a field
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 100000000; k++);
			System.out.println(this.getName()+" :"+i);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestThread tt1 = new TestThread("Robert");
		TestThread tt2 = new TestThread("Olivia");
		tt1.start();
		tt2.start();
		
	}

}
