package com.excelr.dao.service;

import org.springframework.stereotype.Service;

import com.excelr.dao.UserDao;

@Service
public class UserDaoService {
	
	private UserDao dao;
	public UserDaoService(UserDao dao) {
		this.dao = dao;
	}
	public String m1(Integer id) {
		return dao.findNameById(id);
	}
	public String m2(Integer id) {
		return dao.findEmailById(id);
	}

}