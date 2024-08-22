package com.excelr.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.excelr.dao.UserDao;
import com.excelr.dao.service.UserDaoService;

public class MockingEx {
	@Test
	public void test() {
		UserDao dao = mock(UserDao.class);
		when(dao.findNameById(101)).thenReturn("ExcelR");
		
		UserDaoService userDaoService = new UserDaoService(dao);
		String name = userDaoService.m1(101);
		assertEquals("ExcelR", name);
		
	}

}
