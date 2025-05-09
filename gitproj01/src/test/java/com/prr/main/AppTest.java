package com.prr.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {

    
    @Test
    public void testSumWithPositive() {
    	App p = new App();
    	int expected = 500;
    	int actual=p.sum(300, 200);
    	assertEquals(expected,actual);
       
    }
    
    @Test
    public void testSumWithNegative() {
    	App p = new App();
    	int expected = -500;
    	int actual=p.sum(-300, -200);
    	assertEquals(expected,actual);
       
    }
    @Test
    public void testSumWithMixValue() {
    	App p = new App();
    	int expected = 100;
    	int actual=p.sum(300, -200);
    	assertEquals(expected,actual);
       
    }
    @Test
    public void testSumWithZero() {
    	App p = new App();
    	int expected = 0;
    	int actual=p.sum(0, 0);
    	assertEquals(expected,actual);
       
    }
    @Test
    public void testMix() {
    	App p = new App();
    	int expected = 36;
    	int actual=p.sum(78, -42);
    	assertEquals(expected,actual);
       
    }
    @Test
    public void testMixe() {
    	App p = new App();
    	int expected = 30;
    	int actual=p.sum(72, -42);
    	assertEquals(expected,actual);
       
    }
}
