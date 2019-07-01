package com.app.dao;

import java.util.List;
import com.app.pojos.User;

public interface UserInt {
	List<User> listUser();
	String RegisterUser(User u );
}
