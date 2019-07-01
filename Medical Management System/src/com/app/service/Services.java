package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserInt;
import com.app.dao.Userdao;
import com.app.pojos.User;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class Services implements ServiceInt
{
	@Autowired
	
	private UserInt dao;
	@Override
	public List<User> listUser()
	{
		return dao.listUser();
		
	}

	@Override
	public String RegisterUser(User u) 
	{
		return dao.RegisterUser(u);
	}
}
