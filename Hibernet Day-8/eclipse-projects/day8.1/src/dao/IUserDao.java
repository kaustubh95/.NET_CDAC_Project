package dao;

import java.util.Date;
import java.util.List;

import pojos.User;

public interface IUserDao {
	// user registration
	String registerUser(User u);

	// retrieve user dtls by id
	User getUserDetails(int id);

	// get all users
	List<User> getAllUsers();

	// get users by date range
	List<User> getUsersByDate(Date begin, Date end);

	// update user dtls
	String updateUserDetails(int uid, String newPass, boolean status);

	// bulk update
	String bulkUpdateUsers(double discount);

	// unsubscribe user upon login
	String deleteUserDetails(String emai, String pass);

}
