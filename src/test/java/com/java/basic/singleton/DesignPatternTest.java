package com.java.basic.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.java.basics.singleton.BillPughSingletonDP_6;
import com.java.basics.singleton.EarlyLoadingSingletonDP_01;
import com.java.basics.singleton.LazyLoadingSingletonDP_03;
import com.java.basics.singleton.StaticBlockSingletonDP_02;
import com.java.basics.singleton.ThreadDoubleSafetySingletonDP_05;
import com.java.basics.singleton.ThreadSafeSingletonDP_04;

public class DesignPatternTest {

    @Test
    void testEarlySingleton(){
        EarlyLoadingSingletonDP_01 instance=EarlyLoadingSingletonDP_01.getInstace();
        System.out.println("Class instance = "+instance);
        assertEquals(instance,EarlyLoadingSingletonDP_01.getInstace());
        assertEquals(instance,EarlyLoadingSingletonDP_01.getInstace());
    }

    @Test
    void testStaticBlockSingleton() {
        StaticBlockSingletonDP_02 instance = StaticBlockSingletonDP_02.instance;
        System.out.println("Class instance = "+instance);
        // assertEquals(instance, LazyLoadingSingletonDP.getInstance());
        assertEquals(instance, StaticBlockSingletonDP_02.instance);
        assertEquals(instance, StaticBlockSingletonDP_02.instance);
        assertEquals(instance, StaticBlockSingletonDP_02.instance);

    }

  // @Test
   void testLazyLoadingSingleton() {
        LazyLoadingSingletonDP_03 instance = LazyLoadingSingletonDP_03.getInstance();
        System.out.println("Class instance = "+instance);
        assertEquals(instance, LazyLoadingSingletonDP_03.getInstance());
        assertEquals(instance, LazyLoadingSingletonDP_03.getInstance());
        assertEquals(instance, LazyLoadingSingletonDP_03.getInstance());

    }
   
   @Test
   void testThreadSafeSingleton() {
        ThreadSafeSingletonDP_04 instance = ThreadSafeSingletonDP_04.getInstance();
        System.out.println("Class instance = "+instance);
        assertEquals(instance, ThreadSafeSingletonDP_04.getInstance());
        assertEquals(instance, ThreadSafeSingletonDP_04.getInstance());
        assertEquals(instance, ThreadSafeSingletonDP_04.getInstance());

    }
   
   @Test
   void testDoubleThreadSafeSingleton() {
	   ThreadDoubleSafetySingletonDP_05 instance=ThreadDoubleSafetySingletonDP_05.getInstance();
	   System.out.println("Class instance = "+instance);
	   assertEquals(instance, ThreadDoubleSafetySingletonDP_05.getInstance());
	   assertEquals(instance, ThreadDoubleSafetySingletonDP_05.getInstance());
	   assertEquals(instance, ThreadDoubleSafetySingletonDP_05.getInstance());
   }
   
   @Test
   void testBillPughSingleton() {
	   BillPughSingletonDP_6 instance=BillPughSingletonDP_6.getInstance();
	   System.out.println("Class instance = "+instance);
	   assertEquals(instance, BillPughSingletonDP_6.getInstance());
	   assertEquals(instance, BillPughSingletonDP_6.getInstance());
	   assertEquals(instance, BillPughSingletonDP_6.getInstance());
   }

  
}
