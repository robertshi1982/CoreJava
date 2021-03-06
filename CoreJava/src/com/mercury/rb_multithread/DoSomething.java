package com.mercury.rb_multithread;

/**
 * @Title: DoSomething.java
 * @Description: Class who immplements Runnable
 * @author Robert Shi
 * @date Aug 23, 2012 3:57:58 PM
 * @version V1.0
 */
public class DoSomething implements Runnable {

	private String name;
	
	public DoSomething(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i= 0; i < 5; i++) {
			for (long k = 0; k < 100000000; k++);
			System.out.println(name+": "+i);
		}
	}

}
