package com.java.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.java.basics.service.EarlyLoadingSingletonDP;
import com.java.basics.service.LazyLoadingSingletonDP;
import com.java.basics.service.StaticBlockSingletonDP;

public class DesignPatternTest {

    @Test
    void testEarlySingleton(){
        EarlyLoadingSingletonDP instance=EarlyLoadingSingletonDP.getInstace();
        assertEquals(instance,EarlyLoadingSingletonDP.getInstace());
        assertEquals(instance,EarlyLoadingSingletonDP.getInstace());
    }

   @Test
   void testLazyLoadingSingleton() {
        LazyLoadingSingletonDP instance = LazyLoadingSingletonDP.getInstance();
        assertEquals(instance, LazyLoadingSingletonDP.getInstance());
        assertEquals(instance, LazyLoadingSingletonDP.getInstance());
        assertEquals(instance, LazyLoadingSingletonDP.getInstance());

    }

    @Test
    void testStaticBlockSingleton() {
        StaticBlockSingletonDP instance = StaticBlockSingletonDP.instance;
        // assertEquals(instance, LazyLoadingSingletonDP.getInstance());
        assertEquals(instance, StaticBlockSingletonDP.instance);
        assertEquals(instance, StaticBlockSingletonDP.instance);
        assertEquals(instance, StaticBlockSingletonDP.instance);

    }

}
