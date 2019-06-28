package dao;

import java.util.Date;
import java.util.List;

import pojos.User;

public interface IUserDao {
	//store image on db
	String storeImage(int userId,String fileName);
	//restore image from db
	String restoreImage(int userId,String fileName);

}
