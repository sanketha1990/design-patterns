package com.java.basic.prevention;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.basic.dp.singleton.prevention.BillPughSingleton;
import com.basic.dp.singleton.prevention.BillPughSingletonPrevention;

public class SingletonPreventFromReflection {

	@Test
	void testSingletonByClonable() throws CloneNotSupportedException {

		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = (BillPughSingleton) instance1.clone();

		System.out.println("Instance 1 = " + instance1);
		System.out.println("Instance 2 = " + instance2);
		assertNotEquals(instance1, instance2);
	}

	@Test
	@SuppressWarnings("unchecked")
	void testClonablePrevention() throws CloneNotSupportedException {

		BillPughSingletonPrevention instance1 = BillPughSingletonPrevention.getInstance();
		BillPughSingletonPrevention instance2 = Mockito.mock(BillPughSingletonPrevention.class);

		when(instance2.clone()).thenThrow(CloneNotSupportedException.class);

		System.out.println("Instance 1 = " + instance1);
		// System.out.println("Instance 2 = " + instance2);
		assertEquals("java.lang.CloneNotSupportedException", instance2.clone());

	}

}
