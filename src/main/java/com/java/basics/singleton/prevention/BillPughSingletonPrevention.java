package com.java.basics.singleton.prevention;

public class BillPughSingletonPrevention implements Cloneable {

	private BillPughSingletonPrevention() {
		System.out.println("Private BillPughSingletonDP_6 constructor " + BillPughSingletonPrevention.getInstance());
	}

	private static class BillPughSingleton {
		private static final BillPughSingletonPrevention INSTANCE = new BillPughSingletonPrevention();
	}

	public static BillPughSingletonPrevention getInstance() {
		return BillPughSingleton.INSTANCE;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public enum Singleton  
	{ 
	  INSTANCE; 
	} 
}
