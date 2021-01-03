package com.java.basic.prevention;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.basic.dp.singleton.prevention.BillPughSingleton;
import com.basic.dp.singleton.prevention.BillPughSingletonPrevention;

public class SingletonPrevention {

	@Test
	void testSingletonByClonable() throws CloneNotSupportedException {

		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = (BillPughSingleton) instance1.clone();

		System.out.println("Instance 1 = " + instance1);
		System.out.println("Instance 2 = " + instance2);
		assertNotEquals(instance1, instance2);
	}

	// @Test
	void testClonablePrevention() throws CloneNotSupportedException {

		BillPughSingletonPrevention instance1 = BillPughSingletonPrevention.getInstance();
		BillPughSingletonPrevention instance2 = Mockito.mock(BillPughSingletonPrevention.class);

		when(instance2.clone()).thenThrow(CloneNotSupportedException.class);

		System.out.println("Instance 1 = " + instance1);
		// System.out.println("Instance 2 = " + instance2);
		assertEquals("java.lang.CloneNotSupportedException", instance2.clone());
	}

	@Test
	void testSingletonByReflection() throws Exception {

		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = null;

		Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();

		for (Constructor cons : constructors) {
			cons.setAccessible(true);
			instance2 = (BillPughSingleton) cons.newInstance(instance1);
			break;
		}

		System.out.println("instance1 = " + instance1);
		System.out.println("instance2 = " + instance2);
		assertNotEquals(instance1, instance2);
	}

	@Test
	void testSingletonBySerialization() throws Exception {
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("E:\\Personal\\workspace\\design-patterns\\file.txt"));
		out.writeObject(instance1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("E:\\Personal\\workspace\\design-patterns\\file.txt"));
		BillPughSingleton instance2 = (BillPughSingleton) in.readObject();
		in.close();
		
		System.out.println("Instance hashcode 1 = "+instance1);
		System.out.println("Instance hashcode 2 = "+instance2);
		
		assertEquals(instance1, instance2);

	}

}
