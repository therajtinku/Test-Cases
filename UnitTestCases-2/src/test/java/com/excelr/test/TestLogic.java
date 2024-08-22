package com.excelr.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.excelr.logic.Logic;

public class TestLogic {
	
	public static Logic logic;
	
	@BeforeAll
	public static void init() {
		logic = new Logic();
	}
	
	@AfterAll
	public static void destroy() {
		logic = null;
	}
	
	@Test
	public void testAdd() {
		Integer actualValue = logic.add(10, 10);
		Integer expectedValue = 20;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testSub() {
		Integer actualValue = logic.sub(10, 10);
		Integer expectedValue = 0;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testMul() {
		Integer actualValue = logic.mul(10, 10);
		Integer expectedValue = 100;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testDiv() {
		Integer actualValue = logic.div(10, 10);
		Integer expectedValue = 1;
		assertEquals(expectedValue, actualValue);
	}

}
