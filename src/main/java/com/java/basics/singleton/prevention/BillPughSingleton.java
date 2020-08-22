package com.java.basics.singleton.prevention;

import java.io.Serializable;

public class BillPughSingleton implements Cloneable, Serializable {

	private BillPughSingleton() {
		System.out.println("Private BillPughSingleton constructor " + BillPughSingleton.getInstance());
	}

	private static class BillPughSingle {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return BillPughSingle.INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Object readResolve() {
		return BillPughSingle.INSTANCE;

	}
}
