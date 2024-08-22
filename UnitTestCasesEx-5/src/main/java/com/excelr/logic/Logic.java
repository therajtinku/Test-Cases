package com.excelr.logic;

public class Logic {
	public Integer convert(String s) {
		if(s.equals("") || s ==null) {
			throw new IllegalArgumentException("String should not be empty");
		}else {
			return Integer.valueOf(s);
		}
	}

}
