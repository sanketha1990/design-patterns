package com.java.basics.service;

public class LazyLoadingSingletonDP {

	private static LazyLoadingSingletonDP instance = null;

	private LazyLoadingSingletonDP() {
		System.out.println("Private LazyLoadingSingletonDP constructor " + instance);
	}

	public static LazyLoadingSingletonDP getInstance() {
		if (instance == null) {
					return new LazyLoadingSingletonDP();
			}
		}return instance;
}}
