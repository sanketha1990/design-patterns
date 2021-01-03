package com.basic.dp.singleton;

public class LazyLoadingSingletonDP_03 {

	private static LazyLoadingSingletonDP_03 instance = null;

	private LazyLoadingSingletonDP_03() {
		System.out.println("Private LazyLoadingSingletonDP_03 constructor " + instance);
	}

	public static LazyLoadingSingletonDP_03 getInstance() {
		if (instance == null) {
			return new LazyLoadingSingletonDP_03();
		}
		return instance;
	}
}
