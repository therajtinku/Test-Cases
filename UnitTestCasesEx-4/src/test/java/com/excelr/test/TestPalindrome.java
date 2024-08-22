package com.excelr.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.excelr.logic.PalindromeTest;

public class TestPalindrome {
	@ParameterizedTest
	@ValueSource(strings = {"madam","eye"})
	public void check(String s) {
		PalindromeTest palindromeTest = new PalindromeTest();
		boolean actualResult = palindromeTest.check(s);
		assertTrue(actualResult);
	}
}