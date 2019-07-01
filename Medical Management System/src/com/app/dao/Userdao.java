package com.app.dao;
import java.util.List;
import com.app.pojos.User;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class Userdao implements UserInt 
{
	
	@Autowired
	private SessionFactory sf;
	
/*	public List <User> listUser()
	{
		String jpql="select u from UserCon u "; 
		
		return sf.getCurrentSession().createQuery(jpql,User.class).getResultList();
	}
*/
	public String RegisterUser(User u)
	{
		sf.getCurrentSession().persist(u);
		return "user Registered with name::" + u.getFname();
		
	}

	

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		String jpql="select u from User u "; 
		
		return sf.getCurrentSession().createQuery(jpql,User.class).getResultList();
	}

	

}
