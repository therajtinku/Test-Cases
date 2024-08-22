package com.excelr.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.excelr.logic.Logic;
public class TestLogicClass {
	@Test
	public void testadd() {
		Logic logic = new Logic();
		Integer result = logic.add(10, 20);
		assertEquals(30, result);
	}
}
