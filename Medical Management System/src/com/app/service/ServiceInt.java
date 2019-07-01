package com.app.service;

import java.util.List;

import com.app.pojos.User;

public interface ServiceInt 
{
	List<User> listUser();
	String RegisterUser(User u );
}
