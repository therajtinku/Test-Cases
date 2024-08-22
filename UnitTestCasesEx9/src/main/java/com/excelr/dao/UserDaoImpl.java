package com.excelr.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String findNameById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("findNameById called"+id);
		return "ExcelR";
	}

	@Override
	public String findEmailById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("findEmailId called"+id);
		return "ExcelR@123";
	}

}
