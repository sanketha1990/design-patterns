package com.basic.dp.singleton;

public class ThreadSafeSingletonDP_04 {

	private static ThreadSafeSingletonDP_04 instance = null;

	private ThreadSafeSingletonDP_04() {
		System.out.println("Private ThreadSafeSingletonDP_04 constructor " + instance);
	}

	public synchronized static ThreadSafeSingletonDP_04 getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingletonDP_04();
		}
		return instance;
	}

}
