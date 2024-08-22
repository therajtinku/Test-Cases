package com.excelr.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.excelr.logic.Logic;

public class LogicTest {
	@Test
	public void check() {
		Logic logic = new Logic();
		assertThrows(IllegalArgumentException.class, ()-> logic.convert(""));
	}

}