package com.mercury.rb_multithread;

/**
 * @Title: TestRunnable.java
 * @Description: Test for a class who implements Runnable
 * @author Robert Shi
 * @date Aug 23, 2012 3:58:40 PM
 * @version V1.0
 */
public class TestRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoSomething ds1 = new DoSomething("Robert");
		DoSomething ds2 = new DoSomething("Olivia");
		Thread t1 = new Thread(ds1);
		Thread t2 = new Thread(ds2);
		t1.start();
		t2.start();
	}

}
