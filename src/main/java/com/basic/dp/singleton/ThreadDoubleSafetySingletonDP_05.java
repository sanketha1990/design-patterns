package com.basic.dp.singleton;

public class ThreadDoubleSafetySingletonDP_05 {

	private static ThreadDoubleSafetySingletonDP_05 instance = null;

	private ThreadDoubleSafetySingletonDP_05() {
		System.out.println("Private ThreadDoubleSafetySingletonDP_05 constructor " + instance);
	}

	public static ThreadDoubleSafetySingletonDP_05 getInstance() {
		if (instance == null) {

			synchronized (ThreadDoubleSafetySingletonDP_05.class) {
				if (instance == null) {
					instance = new ThreadDoubleSafetySingletonDP_05();
				}
			}
		}
		return instance;
	}

}
