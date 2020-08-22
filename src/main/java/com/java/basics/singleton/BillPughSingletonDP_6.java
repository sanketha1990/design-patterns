package com.java.basics.singleton;

public class BillPughSingletonDP_6{
	
	private BillPughSingletonDP_6() {
		System.out.println("Private BillPughSingletonDP_6 constructor "+BillPughSingletonDP_6.getInstance());
	}
	
	private static class BillPughSingleton{
		private static final BillPughSingletonDP_6 INSTANCE=new BillPughSingletonDP_6();
	}

	public static BillPughSingletonDP_6 getInstance() {
		return BillPughSingleton.INSTANCE;
	}
}
