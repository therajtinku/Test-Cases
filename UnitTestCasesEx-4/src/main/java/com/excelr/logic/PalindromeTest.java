package com.excelr.logic;

public class PalindromeTest {
	public boolean check(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res +=s.charAt(i);
		}
		if(s.equals(res)) {
			return true;
		}else {
			return false;
		}
	}

}